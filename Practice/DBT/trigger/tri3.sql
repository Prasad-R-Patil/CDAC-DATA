DROP TRIGGER if EXISTS tri3;
delimiter $
CREATE TRIGGER tri3 BEFORE DELETE on dept FOR EACH ROW
BEGIN
	
	
    signal sqlstate '42000' set message_text='RECORD can not be DELETE';
	
	
end $
delimiter ;