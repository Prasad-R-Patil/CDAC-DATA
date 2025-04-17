DROP FUNCTION if EXISTS checkUser;
delimiter $
CREATE FUNCTION checkUser(x VARCHAR(200)) returns VARCHAR(500)
deterministic
BEGIN
	set @y='';
	if (select DISTINCT TRUE from login WHERE emailid=x) THEN
	select  concat(username,',',password) INTO @y from login WHERE emailid=x;
	
	ELSE
	
	select 'employee not EXISTS' into @y;
	
	end if;
	RETURN @y;
	
end $
delimiter ;