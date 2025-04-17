DROP TRIGGER if EXISTS tri5;
delimiter $
CREATE TRIGGER tri5 BEFORE INSERT on login FOR EACH ROW
BEGIN
	 set new.emailid=LOWER(new.emailid);        
	
end $
delimiter ;