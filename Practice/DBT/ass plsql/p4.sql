drop PROCEDURE IF EXISTS addUser;
delimiter $
/*CREATE PROCEDURE addUser(in sid int,in snamefirst VARCHAR(45),in snamelast varchar(45),in dob DATE,in emailid varchar(128),in spid int,in spnumber varchar(45),in isActive BOOLEAN,in said int,in saaddress varchar(128))
BEGIN
	if (select TRUE from student where id!=sid) THEN
	INSERT into student VALUES (sid,'snamefirst','snamelast','dob','emailid');
	INSERT into student_phone VALUES (spid,sid,'spnumber',isactive);
	INSERT into student_address VALUES (said,sid,'saaddress');
	
	
	ELSE
	select "student id alredy EXISTS..." warnning;
	end if */
	
	
	
	CREATE PROCEDURE addUser(in sid int,in snamefirst VARCHAR(45),in spid int,in spnumber varchar(45),in saaddress varchar(128))
BEGIN
	
	INSERT into student(id,namefirst) VALUES (sid,snamefirst);
	INSERT into student_phone(id,studentid,number) VALUES (spid,sid,spnumber);
	INSERT into student_address(id,studentid,address) VALUES (sid,sid,saaddress);
	
	select *from student;
	select *from student_phone;
	select *from student_address;
	
	
end $
delimiter ;
	