drop PROCEDURE IF EXISTS proc2;
delimiter $
CREATE PROCEDURE proc2(in p1 int)
BEGIN

	if (SELECT DISTINCT TRUE from emp where deptno=p1) THEN
	SELECT ename,job,sal from emp where deptno=p1;
	ELSE
	SELECT "RECORD not found...";
	end if;
	
	
end $
delimiter ;
	