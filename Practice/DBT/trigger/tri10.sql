DROP TRIGGER if EXISTS tri10;
delimiter $
CREATE TRIGGER tri10 AFTER DELETE on orders FOR EACH ROW
BEGIN
	
	INSERT into archive VALUES (old.ONUM,old.AMT,old.ODATE,old.CNUM,old.SNUM,old.type,old.paymentType,old.registered);
   
	
	
end $
delimiter ;