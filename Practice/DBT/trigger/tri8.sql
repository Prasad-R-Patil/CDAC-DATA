DROP TRIGGER if EXISTS tri8;
delimiter $
CREATE TRIGGER tri8 AFTER UPDATE on login FOR EACH ROW
BEGIN
	
	INSERT into log VALUES (old.username,new.username);
   
	
	
end $
delimiter ;