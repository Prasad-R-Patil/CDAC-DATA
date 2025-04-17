drop PROCEDURE IF EXISTS proc1;
delimiter $
CREATE PROCEDURE proc1(in p1 int)
BEGIN

	DECLARE v1 bool DEFAULT FALSE;
	 SELECT DISTINCT TRUE INTO v1 from emp where deptno=p1;
	 if v1 THEN
	 SELECT ename,job,sal from emp where deptno=p1;
	ELSE 
	 SELECT "RECORD not found...." ;
	end IF;
	
end $
delimiter ;
	