DROP TRIGGER if EXISTS tri11;
delimiter $
CREATE TRIGGER tri11 BEFORE INSERT on amazon FOR EACH ROW
BEGIN
	 set new.membership =  ifnull(new.membership,'Basic');        
	
end $
delimiter ;