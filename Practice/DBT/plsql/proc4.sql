DROP PROCEDURE display;
delimiter $
CREATE PROCEDURE display(in msg VARCHAR(2000))
BEGIN 
    SELECT msg as 'massege box';
	end $
delimiter ;