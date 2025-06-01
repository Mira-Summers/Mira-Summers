CREATE VIEW vz_CurrentBorrowings AS
SELECT
    b.title AS book_title,
    bw.name AS borrower_name,
    br.borrow_date,
    br.due_date,
    DATEDIFF(day, GETDATE(), br.due_date) AS remaining_days,
    l.name AS librarian_name
FROM BorrowRecord br
JOIN Book b ON br.book_id = b.book_id
JOIN Borrower bw ON br.borrower_id = bw.borrower_id
JOIN Librarian l ON br.librarian_id = l.librarian_id
WHERE br.status = N'借出中';
GO
CREATE VIEW vw_CurrentBorrowings AS
SELECT
????b.title AS book_title,
????bw.name AS borrower_name,
????br.borrow_date,
????br.due_date,
????DATEDIFF(day, GETDATE(), br.due_date) AS remaining_days,
????l.name AS librarian_name
FROM BorrowRecord br
JOIN Book b ON br.book_id = b.book_id
JOIN Borrower bw ON br.borrower_id = bw.borrower_id
JOIN Librarian l ON br.librarian_id = l.librarian_id
WHERE br.status = N'借出中';
go
