DROP TRIGGER if EXISTS tri2;
delimiter $
CREATE TRIGGER tri2 BEFORE UPDATE on emp FOR EACH ROW
BEGIN
	   if old.sal>NEW.sal THEN
    signal sqlstate '42000' set message_text='salery is less than old salery...';
	end if;
	
end $
delimiter ;