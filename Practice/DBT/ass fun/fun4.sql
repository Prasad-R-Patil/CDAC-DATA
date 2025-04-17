DROP FUNCTION if EXISTS sumMarks;
delimiter $
CREATE FUNCTION sumMarks(x int) returns int
deterministic
BEGIN
 set @y=0;
 if x in (select DISTINCT studentid from student_qualifications) THEN
   select sum(marks) into @y from student_qualifications where studentid=x;
  
   end if;
   RETURN @y;
end $
delimiter ;