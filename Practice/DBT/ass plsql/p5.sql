drop PROCEDURE IF EXISTS addQualification;
delimiter $
CREATE PROCEDURE addQualification(in sqid int,in sid int, in name varchar(20), in college varchar(200),in university varchar(220),in marks varchar(20),in year int,out resultm varchar(500))
BEGIN
     DECLARE studentid_exist int;
	 SELECT COUNT(*) INTO studentid_exist FROM student WHERE id = sid;
	 
	 if studentid_exist>0 THEN
	 
	 insert into student_qualifications VALUES (sqid,sid,name,college,university,marks,year);
	 
	 set resultm='record inserted SUCCESSFULLY';
	 
	 ELSE
	   set resultm='student id not found';
	   end if;
select @x;
   
	
end $
delimiter ;
	