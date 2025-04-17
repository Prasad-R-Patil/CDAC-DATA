drop PROCEDURE IF EXISTS s1;
delimiter $
CREATE PROCEDURE s1(in x int,out z int, out y int)
BEGIN
	

	set z:=x*x;
	set y:=x*x*x;
	select x,z,y;
	end $
	delimiter ;