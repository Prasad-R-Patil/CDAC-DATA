DROP TRIGGER if EXISTS tri7;
delimiter $
CREATE TRIGGER tri7 BEFORE UPDATE on login FOR EACH ROW
BEGIN
	 if old.emailid != new.emailid THEN
	 signal sqlstate '42000' set message_text='Your permission denied for emailID CHANGE...';
	end if;        
	
end $
delimiter ;