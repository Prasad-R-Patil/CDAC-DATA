DROP PROCEDURE if EXISTS proc5;
delimiter $
CREATE PROCEDURE proc5(in _deptno int,in _dname VARCHAR(12),in _loc VARCHAR(10), in _PWD VARCHAR(20),in _startedon VARCHAR(10))
 BEGIN 
     if _loc ='baroda' THEN
        INSERT INTO dept VALUES(_deptno,_dname,UPPER(_loc),_PWD,_startedon);
 
     ELSE
        call display ('invalid location>>>>');
      end if;
  end $
  delimiter ;
