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
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Customer does not exist';
delimiter ;







drop procedure if exists pro5;
delimiter $
create procedure pro5()
BEGIN
	select * from dept;
end $
delimiter ;



drop procedure if exists pro5;
delimiter $
create procedure pro5(in p1 int)
BEGIN
	select ename,job,sal from emp where deptno = p1;
end $
delimiter ;


drop procedure if exists pro5;
delimiter $
create procedure pro5(in p1 int)
BEGIN
	declare v1 bool default false;
	
	select distinct true into v1 from emp where deptno=p1;
	
	if v1 THEN
		select ename,job,sal from emp where deptno = p1;
	ELSE
		select "Record not found...";
	end if;
end $
delimiter ;




drop procedure if exists pro5;
delimiter $
create procedure pro5(in p1 int)
BEGIN

	if (select distinct true from emp where deptno=p1) THEN
		select ename,job,sal from emp where deptno = p1;
	ELSE
		select "Record not found...";
	end if;
end $
delimiter ;



drop procedure if exists display;
delimiter $
create procedure display(in msg varchar(2000))
BEGIN
	select msg as 'Message Box';
end $
delimiter ;


drop procedure if exists pro5;
delimiter $
create procedure pro5( in _deptno int, in _dname varchar(12), in _loc varchar(10),  in _PWD varchar(20), in _STARTEDON varchar(10) )
BEGIN
	if _loc = 'baroda' THEN
		insert into dept values(_deptno, _dname, upper(_loc), _PWD, _STARTEDON);
	ELSE
		call display('Invalid location....');
	end if;
	
end $
delimiter ;





drop procedure if exists pro5;
delimiter $
create procedure pro5( inout x int )
BEGIN
	set x := x*x;
end $
delimiter ;




drop procedure if exists pro5;
delimiter $
create procedure pro5()
BEGIN
	prepare x from 'select * from emp';
	execute x;
end $
delimiter ;


drop procedure if exists pro5;
delimiter $
create procedure pro5(in _columnList varchar(2000), in _tableName varchar(64))
BEGIN
	set @a := concat('select ', _columnList ,  ' from ', _tableName);
	prepare x from @a;
	execute x;
	
end $
delimiter ;



drop procedure if exists pro5;
delimiter $
create procedure pro5(in _deptno int)
BEGIN
	set @a := concat('insert into dept(deptno) values (', _deptno , ')');
	
	prepare obj from @a;
	execute obj;
end $
delimiter ;



drop procedure if exists pro5;
delimiter $
create procedure pro5(in _deptno int, in _dname varchar(20))
BEGIN
	set @p1 := _deptno;
	set @p2 := _dname;
	
	set @a := concat('insert into dept(deptno,dname) values (?, ?)');
	
	prepare obj from @a;
	execute obj using @p1, @p2;
	
	
end $
delimiter ;



drop procedure if exists pro5;
delimiter $
create procedure pro5(in _columnList varchar(2000), in _tableName varchar(64))
BEGIN
	set @a := concat('select ', _columnList ,  ' from ', _tableName);
	prepare x from @a;
	execute x;
	
end $
delimiter ;



DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5()
begin
	declare exit handler for 1050 call display('Table present'); 
	create table abc (c1 int primary key, c2 int not null);
end $
delimiter ;



DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5()
begin
	declare _dname, _loc varchar(20);
	declare _deptno int;
	
	declare c1 cursor for select deptno, dname,loc from dept;
	declare exit handler for 1329 select 'No more data...';
	open c1;
	  loop 
		fetch c1 into _deptno, _dname, _loc;
		select _deptno, _dname, _loc;
	end loop;
	close c1;
	
end $
delimiter ;



DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5()
begin
	declare x int;
	declare exit handler for 1366 call display('very Bad');
	set x := 'ruhan';
	begin
		declare exit handler for 1366 call display('Bad');
		set x := 'saleel';
	end ;
end $
delimiter ;




DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5( in _deptno int)
begin
	declare flag bool default false;
	select true into flag from dept where deptno=_deptno;
	if flag THEN
		begin
			declare _ename varchar(20);
			declare __deptno int;
			declare c1 cursor for select ename,deptno from emp where deptno=_deptno;
			declare exit handler for 1329 select 'No more data... in EMP table';
			open c1;
				loop
					fetch c1 into _ename, __deptno;
					select _ename, __deptno;
				end loop;
			close c1;
		end ;
	ELSE
		call display('Not Found... in DEPT table');
	end if;
end $
delimiter ;



DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5()
begin
	declare _ename varchar(20);
	declare __deptno int;
	declare c1 cursor for select ename, deptno from emp;
	declare exit handler for 1329 select 'No more data... in EMP table';
	open c1;
	loop
		fetch c1 into _ename, __deptno;
			if  __deptno = 10 THEN
				insert into e10 values(_ename, __deptno);
			ELSEIF __deptno = 20 THEN
				insert into e20 values(_ename, __deptno);
			end if;
	end loop;
	close c1;
end $
delimiter ;




DROP function IF EXISTS fn1;
delimiter $
CREATE function fn1( x int, y int) returns int
DETERMINISTIC
begin
	return ifnull(x,0) + ifnull(y,0);
end $
delimiter ;


DROP function IF EXISTS fn1;
delimiter $
CREATE function fn1() returns int
DETERMINISTIC
begin
	declare x int default 0;
	select max(deptno) + 1 into x from dept;
	return x;
end $
delimiter ;




DROP PROCEDURE IF EXISTS pro5;
delimiter $
CREATE PROCEDURE pro5(out x varchar(550))
begin
	declare flag bool default false;
	
	select distinct true into flag from emp where deptno=10;
	
	if flag THEN
		set x := 'DEpartment number is present in employee table from procedure ';
	end if;
end $
delimiter ;

DROP function IF EXISTS fn1;
delimiter $
CREATE function fn1() returns varchar(1000)
DETERMINISTIC
begin
	return 'DEpartment number is present in employee table from function';
end $
delimiter ;




DROP trigger IF EXISTS tr1;
delimiter $
CREATE trigger tr1 after insert on dept for each row
begin
	set @x := "hello world from saleel";
end $
delimiter ;




DROP trigger IF EXISTS tr1;
delimiter $
CREATE trigger tr1 after insert on d for each row
begin
	insert into dbk1 values(new.deptno, new.dname); 
	insert into dbk2 values(new.deptno, new.dname);
end $
delimiter ;


DROP trigger IF EXISTS tr2;
delimiter $
CREATE trigger tr2 after delete on d for each row
begin
	insert into log values(old.deptno, old.dname,curdate(), curtime(), user());
end $
delimiter ;
*/

/*
mysql> insert into d values(10, 'purchase');  
							new.deptno=10, new.dname= 'purchase'


mysql> insert into d values(20, 'sales');
							new.deptno=20, new.dname= 'sales'
*/

/* 
DROP trigger IF EXISTS tr4;
delimiter $
CREATE trigger tr4 after delete on log for each row
begin
	signal sqlstate '42000' set message_text='Records cannot be deleted';
end $
delimiter ;



DROP trigger IF EXISTS tr4;
delimiter $
CREATE trigger tr4 before insert on d for each row
begin
	declare x int;
	select count(*) into x from d;
	if x>3 THEN
		signal sqlstate '42000' set message_text='Records cannot be inserted';
	end if;
end $
delimiter ;




DROP trigger IF EXISTS tr4;
delimiter $
CREATE trigger tr4 before insert on dept for each row
begin
	declare x int;
	select max(deptno) + 4 into x from dept;
	set new.deptno = x;
	set new.dname := upper(new.dname);
	if new.loc is null then
		signal sqlstate '42000' set message_text = 'Invvalid data';
	end if;
end $
delimiter ;
*/