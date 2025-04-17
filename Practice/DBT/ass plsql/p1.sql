drop PROCEDURE IF EXISTS addUser;
delimiter $
CREATE PROCEDURE addUser(in _username VARCHAR(20),in _password varchar(20) , _emailid varchar(50))
BEGIN
	INSERT INTO login VALUES(_username,_password,_emailid);
	select * from login;
end $
delimiter ;
	