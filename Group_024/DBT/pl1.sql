/* drop procedure if exists pro1;
delimiter $
create procedure pro1()
BEGIN
	select "Hello World" MessageBox;
end $
delimiter ;




drop procedure if exists pro2;
delimiter $
create procedure pro2(in x int,out y int, out z int)
BEGIN
	
	set y := x*x;
	set z := x*x*x;
	
end $
delimiter ;

*/

drop procedure if exists pro3;
delimiter $
create procedure pro3()
BEGIN
   
   declare x, cnt int;
   declare z, q varchar(200);
   select c1  into q from stringnumber limit 1;
   
   set x := length(q);
   set cnt:= 1;
   ab:LOOP
	
		select substr(q, cnt, 1) into z ;
		
		if ascii(z) between 97 and 122 THEN
			select 'hello';
		elseif ascii(z) between 65 and 90 THEN
			select 'world';
		end if;
		
		set cnt := cnt + 1;
		if cnt > x THEN
			leave ab;
		end if;
   end loop ab;
  
end $
delimiter ;











































































