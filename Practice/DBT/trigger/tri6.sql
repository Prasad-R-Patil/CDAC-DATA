DROP TRIGGER if EXISTS tri6;
delimiter $
CREATE TRIGGER tri6 BEFORE INSERT on dept FOR EACH ROW
BEGIN
	 set new.dname =  ifnull(new.dname,'employee');        
	
end $
delimiter ;