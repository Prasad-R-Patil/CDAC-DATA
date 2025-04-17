drop PROCEDURE IF EXISTS pro2;
delimiter $
CREATE PROCEDURE pro2(in x int,in y int)
BEGIN
	DECLARE z int;

	set z:=x+y;
	SELECT z;
	end $
	delimiter ;
	