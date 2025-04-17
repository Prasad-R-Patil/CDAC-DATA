DROP TRIGGER if EXISTS tri1;
delimiter $
CREATE TRIGGER tri1 BEFORE INSERT on dept FOR EACH ROW
BEGIN
	 set new.dname=UPPER(new.dname);        
	
end $
delimiter ;