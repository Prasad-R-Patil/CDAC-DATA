-- Create table: publisher
CREATE TABLE publisher (
    empno INT PRIMARY KEY,
    ename VARCHAR(100),
    job VARCHAR(50),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10,2),
    comm DECIMAL(10,2),
    deptno INT,
    hobbyid INT
);

-- Create table: author
CREATE TABLE author (
    authorid INT PRIMARY KEY,
    firstName VARCHAR(100),
    lastName VARCHAR(100),
    phone VARCHAR(20),
    emailid VARCHAR(100)
);

-- Create table: book
CREATE TABLE book (
    isbn VARCHAR(20) PRIMARY KEY,
    title VARCHAR(200),
    language VARCHAR(50),
    mrp DECIMAL(10,2),
    publisherid INT,
    release_date DATE,
    FOREIGN KEY (publisherid) REFERENCES publisher(empno)
);

-- Create table: book_author
CREATE TABLE book_author (
    id INT PRIMARY KEY,
    isbn VARCHAR(20),
    authorid INT,
    FOREIGN KEY (isbn) REFERENCES book(isbn),
    FOREIGN KEY (authorid) REFERENCES author(authorid)
);

-- Sample data for publisher
INSERT INTO publisher VALUES (101, 'John Smith', 'Manager', NULL, '2015-06-01', 80000, 5000, 10, 1);
INSERT INTO publisher VALUES (102, 'Mary Johnson', 'Editor', 101, '2016-03-15', 60000, 3000, 20, 2);
INSERT INTO publisher VALUES (103, 'Alan Brown', 'Publisher', 101, '2017-09-30', 75000, 4500, 10, 3);
INSERT INTO publisher VALUES (104, 'Rachel Green', 'Director', NULL, '2014-01-20', 95000, 7000, 30, 4);

-- Sample data for author (Indian phone number format)
INSERT INTO author VALUES (1, 'Alice', 'Walker', '9876543210', 'alice@example.com');
INSERT INTO author VALUES (2, 'Bob', 'Brown', '9876543211', 'bob@example.com');
INSERT INTO author VALUES (3, 'Clara', 'White', '9123456789', 'clara@example.com');
INSERT INTO author VALUES (4, 'Daniel', 'Lee', '9812345670', 'daniel@example.com');
INSERT INTO author VALUES (5, 'Eva', 'Nguyen', '9912345678', 'eva@example.com');

-- Sample data for book
INSERT INTO book VALUES ('978-1234567890', 'The Great Adventure', 'English', 499.99, 101, '2020-01-10');
INSERT INTO book VALUES ('978-0987654321', 'Mystery of the Lost Island', 'English', 299.99, 102, '2021-07-22');
INSERT INTO book VALUES ('978-1122334455', 'Science of Everything', 'English', 399.50, 103, '2019-05-30');
INSERT INTO book VALUES ('978-5566778899', 'Cooking with Love', 'French', 259.99, 104, '2018-11-12');
INSERT INTO book VALUES ('978-6677889900', 'World History: A Timeline', 'Spanish', 349.75, 102, '2022-03-05');
INSERT INTO book VALUES ('978-3344556677', 'Exploring the Cosmos', 'English', 579.00, 103, '2023-08-18');

-- Sample data for book_author
INSERT INTO book_author VALUES (1, '978-1234567890', 1);
INSERT INTO book_author VALUES (2, '978-0987654321', 2);
INSERT INTO book_author VALUES (3, '978-1122334455', 3);
INSERT INTO book_author VALUES (4, '978-5566778899', 4);
INSERT INTO book_author VALUES (5, '978-6677889900', 1);
INSERT INTO book_author VALUES (6, '978-6677889900', 5); -- Co-author
INSERT INTO book_author VALUES (7, '978-3344556677', 2);
INSERT INTO book_author VALUES (8, '978-3344556677', 3); -- Co-author

