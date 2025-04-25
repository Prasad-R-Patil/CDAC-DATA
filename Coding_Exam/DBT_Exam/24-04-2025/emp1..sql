


-- 1. Drop existing tables (if they exist) in reverse order of dependencies
DROP TABLE IF EXISTS emp1;
DROP TABLE IF EXISTS dept;
DROP TABLE IF EXISTS hobby;
DROP TABLE IF EXISTS location;

-- 2. Create tables
CREATE TABLE location (
    locationid INT PRIMARY KEY,
    locationname VARCHAR(50) NOT NULL
);

CREATE TABLE hobby (
    hobbyid INT PRIMARY KEY,
    hobbyname VARCHAR(50) NOT NULL
);

CREATE TABLE dept (
    deptno INT PRIMARY KEY,
    dname VARCHAR(50) NOT NULL,
    locationid INT,
    FOREIGN KEY (locationid) REFERENCES location(locationid)
);

CREATE TABLE emp1 (
    empno INT PRIMARY KEY,
    ename VARCHAR(50) NOT NULL,
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10,2),
    comm DECIMAL(10,2),
    deptno INT,
    hobbyid INT,
    FOREIGN KEY (deptno) REFERENCES dept(deptno),
    FOREIGN KEY (hobbyid) REFERENCES hobby(hobbyid),
    FOREIGN KEY (mgr) REFERENCES emp1(empno)
);

-- 3. Insert sample data
-- Locations
INSERT INTO location (locationid, locationname) VALUES
(1, 'New York'),
(2, 'Dallas'),
(3, 'Chicago'),
(4, 'Boston'),
(5, 'San Francisco');

-- Hobbies
INSERT INTO hobby (hobbyid, hobbyname) VALUES
(1, 'Reading'),
(2, 'Hiking'),
(3, 'Photography'),
(4, 'Gaming'),
(5, 'Cooking'),
(6, 'Sports'),
(7, 'Music'),
(8, 'Traveling');

-- Departments
INSERT INTO dept (deptno, dname, locationid) VALUES
(10, 'ACCOUNTING', 1),
(20, 'RESEARCH', 2),
(30, 'SALES', 3),
(40, 'OPERATIONS', 4),
(50, 'MARKETING', 1);

-- Employees (now in emp1 table)
INSERT INTO emp1 (empno, ename, job, mgr, hiredate, sal, comm, deptno, hobbyid) VALUES
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10, 1),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30, 2),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10, 3),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20, 4),
(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000.00, NULL, 20, 5),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000.00, NULL, 20, 6),
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, NULL, 20, 7),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30, 8),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30, 1),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30, 2),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500.00, 0.00, 30, 3),
(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100.00, NULL, 20, 4),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950.00, NULL, 30, 5),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10, 6);

-- 4. Completion message
SELECT 'Database setup completed successfully with emp1 table!' AS message;

