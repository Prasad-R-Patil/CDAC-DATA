DROP PROCEDURE IF EXISTS loop1;

DELIMITER $
CREATE PROCEDURE loop1()
BEGIN
   DECLARE x INT;
   SET x := 1;
   lbl: LOOP 
      SELECT x; 
      SET x := x + 1; 
      IF x > 10 THEN 
         LEAVE lbl; 
      END IF;
   END LOOP lbl;     
END $
DELIMITER ;
