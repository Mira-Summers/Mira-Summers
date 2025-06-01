CREATE OR ALTER VIEW vw_FinePaymentStats AS
SELECT 
    f.borrower_id,
    b.name AS borrower_name,
    COUNT(*) AS total_fines,
    SUM(CASE WHEN f.status = '已支付' THEN 1 ELSE 0 END) AS paid_count,
    SUM(CASE WHEN f.status = '未支付' THEN 1 ELSE 0 END) AS unpaid_count,
    SUM(f.fine_amount) AS total_fine_amount,
    SUM(CASE WHEN f.status = '已支付' THEN f.fine_amount ELSE 0 END) AS paid_amount,
    SUM(CASE WHEN f.status = '未支付' THEN f.fine_amount ELSE 0 END) AS unpaid_amount
FROM FineRecord f
JOIN Borrower b ON f.borrower_id = b.borrower_id
GROUP BY f.borrower_id, b.name;