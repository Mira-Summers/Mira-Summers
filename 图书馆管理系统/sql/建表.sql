use library_manager;
IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'Borrower')
begin
CREATE TABLE Borrower (
    borrower_id INT  PRIMARY KEY,
    bname VARCHAR (50) NOT NULL,
    phone VARCHAR (15) NOT NULL,
    current_borrow_count INT DEFAULT 0,
    total_fine DECIMAL (10,2) DEFAULT 0.00,
    is_blacklisted bit DEFAULT 0,
    registration_date DATE NOT NULL,
    last_activity_date TIMESTAMP 
);
end
IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'Librarian')
begin
CREATE TABLE Librarian (
    librarian_id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    position VARCHAR(30),
    hire_date DATE,
);
end
IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'Book')
begin
CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author VARCHAR(50),
    isbn VARCHAR(20) UNIQUE,
    status NVARCHAR(10) NOT NULL DEFAULT N'在库',
    max_borrow_days INT NOT NULL DEFAULT 30,
    publish_date DATE,
    publisher VARCHAR(50),
    price DECIMAL(10,2),

CONSTRAINT CK_Book_Status CHECK (
        status IN (N'在库', N'借出', N'预约中', N'维修中')
    )
);
end
if not exists (select * from sys.tables where name = 'BorrowRecord')
begin
CREATE TABLE BorrowRecord (
    record_id INT IDENTITY(1,1) PRIMARY KEY,
    book_id INT NOT NULL FOREIGN KEY REFERENCES Book(book_id),
    borrower_id INT NOT NULL FOREIGN KEY REFERENCES Borrower(borrower_id),
    librarian_id INT NOT NULL FOREIGN KEY REFERENCES Librarian(librarian_id),
    borrow_date DATETIME NOT NULL DEFAULT GETDATE(),
    due_date DATETIME NOT NULL,
    actual_return_date DATETIME,
    return_librarian_id INT FOREIGN KEY REFERENCES Librarian(librarian_id),
    status NVARCHAR(10) NOT NULL DEFAULT N'借出中',
    renewed_times INT DEFAULT 0,
    fine_amount DECIMAL(10,2) DEFAULT 0.00,
    CONSTRAINT CK_BorrowRecord_Status CHECK (status IN (N'借出中',N'已归还',N'逾期未还')),
    CONSTRAINT CK_BorrowRecord_Dates CHECK (due_date > borrow_date)
);
end
if not exists (select * from sys.tables where name = 'fineRecord')
begin
create table fineRecord(
    fine_id INT PRIMARY KEY,
    record_id INT NOT NULL,
    borrower_id INT NOT NULL,
    librarian_id INT NOT NULL,
    overdue_days INT NOT NULL,
    fine_amount DECIMAL(10,2) NOT NULL,
	payment_date DATETIME,
    remarks VARCHAR(200),
    FOREIGN KEY (record_id) REFERENCES BorrowRecord(record_id),
    FOREIGN KEY (borrower_id) REFERENCES Borrower(borrower_id),
    FOREIGN KEY (librarian_id) REFERENCES Librarian(librarian_id)
	);
end