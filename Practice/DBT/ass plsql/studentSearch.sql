/*drop procedure if exists studentSearch;
delimiter $
create procedure studentSearch(in _studentID int)
begin 
 if(select true from student_qualifications where _studentID=studentID)
 then
  select * from student_qualifications;
 else
  select "Student not found";
 end if;
end $
delimiter ; 
*/

drop procedure if exists getTotalMarks;
delimiter $
create procedure GetTotalMarks(in student_id int,out total_marks int)
begin

 select sum(marks) as total_marks  from student_qualifications where name in(10,12,'BE');
 
end $
delimiter ; 
