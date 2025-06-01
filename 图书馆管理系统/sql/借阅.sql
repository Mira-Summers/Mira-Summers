CREATE PROCEDURE sp_BorrowBook
    @book_id INT,
    @borrower_id INT,
    @librarian_id INT
AS
BEGIN
    SET NOCOUNT ON;
    BEGIN TRY
        BEGIN TRANSACTION;
         
        -- 验证图书状态
        DECLARE @book_status NVARCHAR(10);
        SELECT @book_status = status FROM Book WHERE book_id = @book_id;
         
        IF @book_status <> N'在库'
            THROW 50001, '图书当前不可借阅', 1;
             
        -- 验证借书人资格
        DECLARE @current_count INT, @max_limit INT = 5;
        SELECT @current_count = current_borrow_count 
        FROM Borrower 
        WHERE borrower_id = @borrower_id AND is_blacklisted = 0;
         
        IF @current_count >= @max_limit
            THROW 50002, '借书数量已达上限', 1;
         
        -- 计算应还日期
        DECLARE @due_date DATETIME;
        SELECT @due_date = DATEADD(day, max_borrow_days, GETDATE())
        FROM Book WHERE book_id = @book_id;
         
        -- 执行借书操作
        UPDATE Book SET status = N'借出' WHERE book_id = @book_id;
         
        INSERT INTO BorrowRecord(book_id, borrower_id, librarian_id, borrow_date, due_date)
        VALUES (@book_id, @borrower_id, @librarian_id, GETDATE(), @due_date);
         
        -- 更新借书人信息
        UPDATE Borrower 
        SET 
            current_borrow_count = current_borrow_count + 1
        WHERE borrower_id = @borrower_id;
         
        COMMIT TRANSACTION;
        SELECT 0 AS error_code, '借书成功' AS message;
    END TRY
    BEGIN CATCH
        ROLLBACK TRANSACTION;
        THROW;
    END CATCH
END;
