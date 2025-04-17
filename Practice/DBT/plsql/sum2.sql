drop PROCEDURE IF EXISTS pro2;
delimiter $
CREATE PROCEDURE pro2(in x int,in y int,out z int)
BEGIN
	

	set z:=x+y;
	
	end $
	delimiter ;
	