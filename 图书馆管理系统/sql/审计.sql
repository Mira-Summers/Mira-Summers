
-- 创建借书记录触发器
CREATE TRIGGER tr_BorrowRecord_Audit
ON BorrowRecord
AFTER INSERT, UPDATE, DELETE
AS
BEGIN
????SET NOCOUNT ON;
?????
????-- 记录插入操作
????IF EXISTS (SELECT * FROM inserted) AND NOT EXISTS (SELECT * FROM deleted)
????BEGIN
????????INSERT INTO AuditLog (user_name, action_type, table_name, record_id, new_value)
????????SELECT
????????????SYSTEM_USER, 'INSERT', 'BorrowRecord', 
????????????i.record_id,
????????????(SELECT * FROM inserted FOR JSON PATH)
????????FROM inserted i;
????END
?????
????-- 记录更新操作
????IF EXISTS (SELECT * FROM inserted) AND EXISTS (SELECT * FROM deleted)
????BEGIN
????????INSERT INTO AuditLog (user_name, action_type, table_name, record_id, old_value, new_value)
????????SELECT
????????????SYSTEM_USER, 'UPDATE', 'BorrowRecord', 
????????????i.record_id,
????????????(SELECT * FROM deleted FOR JSON PATH),
????????????(SELECT * FROM inserted FOR JSON PATH)
????????FROM inserted i;
????END
?????
????-- 记录删除操作
????IF NOT EXISTS (SELECT * FROM inserted) AND EXISTS (SELECT * FROM deleted)
????BEGIN
????????INSERT INTO AuditLog (user_name, action_type, table_name, record_id, old_value)
????????SELECT
????????????SYSTEM_USER, 'DELETE', 'BorrowRecord', 
????????????d.record_id,
????????????(SELECT * FROM deleted FOR JSON PATH)
????????FROM deleted d;
????END
END;