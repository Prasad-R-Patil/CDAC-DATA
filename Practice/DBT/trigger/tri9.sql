DROP TRIGGER if EXISTS tri9;
delimiter $
CREATE TRIGGER tri9 BEFORE DELETE on login FOR EACH ROW
BEGIN
	 if old.username='babuuu'  THEN
	 signal sqlstate '42000' set message_text='You Can Not DELETE Admin Diteal...';
	end if;        
	
end $
delimiter ;