DROP PROCEDURE IF EXISTS checkUser;
DELIMITER $

CREATE PROCEDURE checkUser(IN email VARCHAR(50))
BEGIN
   
	
	
    IF EXISTS (SELECT  TRUE FROM login WHERE emailid = email) THEN
        SELECT username, password FROM login WHERE emailid = email;
    ELSE
        INSERT INTO log (date,time,msg) VALUES (curdate(),now(),'User not found');
		SELECT *from log;
    END IF;
	
	
	
END $



DELIMITER ;