CREATE PROCEDURE sp_BorrowBook
    @book_id INT,
    @borrower_id INT,
    @librarian_id INT
AS
BEGIN
    SET NOCOUNT ON;
    BEGIN TRY
        BEGIN TRANSACTION;
         
        -- ��֤ͼ��״̬
        DECLARE @book_status NVARCHAR(10);
        SELECT @book_status = status FROM Book WHERE book_id = @book_id;
         
        IF @book_status <> N'�ڿ�'
            THROW 50001, 'ͼ�鵱ǰ���ɽ���', 1;
             
        -- ��֤�������ʸ�
        DECLARE @current_count INT, @max_limit INT = 5;
        SELECT @current_count = current_borrow_count 
        FROM Borrower 
        WHERE borrower_id = @borrower_id AND is_blacklisted = 0;
         
        IF @current_count >= @max_limit
            THROW 50002, '���������Ѵ�����', 1;
         
        -- ����Ӧ������
        DECLARE @due_date DATETIME;
        SELECT @due_date = DATEADD(day, max_borrow_days, GETDATE())
        FROM Book WHERE book_id = @book_id;
         
        -- ִ�н������
        UPDATE Book SET status = N'���' WHERE book_id = @book_id;
         
        INSERT INTO BorrowRecord(book_id, borrower_id, librarian_id, borrow_date, due_date)
        VALUES (@book_id, @borrower_id, @librarian_id, GETDATE(), @due_date);
         
        -- ���½�������Ϣ
        UPDATE Borrower 
        SET 
            current_borrow_count = current_borrow_count + 1
        WHERE borrower_id = @borrower_id;
         
        COMMIT TRANSACTION;
        SELECT 0 AS error_code, '����ɹ�' AS message;
    END TRY
    BEGIN CATCH
        ROLLBACK TRANSACTION;
        THROW;
    END CATCH
END;
