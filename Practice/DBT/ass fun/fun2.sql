DROP FUNCTION if EXISTS autoNumber;
delimiter $
CREATE FUNCTION autoNumber() returns int
deterministic
BEGIN
	set @x=0;
	select ifnull(max(studentid),0)+1 INTO @x from student_new;
	RETURN @x;
	
	
end $
delimiter ;