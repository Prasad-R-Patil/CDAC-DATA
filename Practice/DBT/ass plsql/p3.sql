drop PROCEDURE IF EXISTS getQualification;
delimiter $
CREATE PROCEDURE getQualification(in _studentid int)
BEGIN
	
	if (select true from student where id=_studentid) THEN
		select s.*,sq.* from student s join student_qualifications sq on s.id=sq.studentid where s.id= _studentid;
	ELSE
		select "student not found..." warnning;
	end if;
	
end $
delimiter ;
	