DROP FUNCTION if EXISTS sumSalery;
delimiter $
CREATE FUNCTION sumSalery(x int) returns int
deterministic
BEGIN
 set @y=0;
 if x in (select DISTINCT deptno from emp) THEN
   select sum(sal) into @y from emp where deptno=x;
  
   end if;
   RETURN @y;
end $
delimiter ;