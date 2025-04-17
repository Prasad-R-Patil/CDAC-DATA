DROP TRIGGER if EXISTS tri4;
delimiter $
CREATE TRIGGER tri4 AFTER DELETE on d1 FOR EACH ROW
BEGIN
	
	INSERT into d2 VALUES (old.c1,old.c2);
   
	
	
end $
delimiter ;