-- Drop tables if they exist (to avoid conflicts)
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS salespeople;

-- Create salespeople table
CREATE TABLE salespeople (
    snum INT PRIMARY KEY,
    sname VARCHAR(50),      -- Increased size for longer names
    city VARCHAR(50),
    comm DECIMAL(5,2)       -- Commission percentage (e.g., 0.12 = 12%)
);

-- Create customers table
CREATE TABLE customers (
    cnum INT PRIMARY KEY,
    cname VARCHAR(50),
    city VARCHAR(50),
    rating INT,
    snum INT,
    FOREIGN KEY (snum) REFERENCES salespeople(snum)
);

-- Create orders table
CREATE TABLE orders (
    onum INT PRIMARY KEY,
    amt DECIMAL(10,2),
    odate DATE,
    cnum INT,
    snum INT,
    FOREIGN KEY (cnum) REFERENCES customers(cnum),
    FOREIGN KEY (snum) REFERENCES salespeople(snum)
);

-- Insert data into salespeople
INSERT INTO salespeople (snum, sname, city, comm) VALUES
(1001, 'John Doe', 'New York', 0.10),
(1002, 'Jane Smith', 'Chicago', 0.12),
(1003, 'Mike Johnson', 'Los Angeles', 0.15),
(1004, 'Emily Davis', 'Dallas', 0.11),
(1005, 'Monika Sharma', 'London', 0.13),
(1006, 'Raj Patel', 'San Jose', 0.14),
(1007, 'Liam Chen', 'Toronto', 0.10);

-- Insert data into customers
INSERT INTO customers (cnum, cname, city, rating, snum) VALUES
(2001, 'Acme Corp', 'New York', 100, 1001),
(2002, 'Global Tech', 'Chicago', 200, 1002),
(2003, 'SuperMart', 'Dallas', 150, 1004),
(2004, 'Fresh Foods', 'Los Angeles', 120, 1003),
(2005, 'TechZone Ltd', 'San Jose', 220, 1006),
(2006, 'Bright Electronics', 'Toronto', 180, 1007),
(2007, 'Urban Furnishings', 'London', 130, 1005),
(2008, 'Daily Supplies', 'Chicago', 90, 1002),
(2009, 'Peak Performance', 'San Jose', 210, 1006),
(2010, 'EcoMart', 'London', 160, 1005);

-- Insert data into orders
INSERT INTO orders (onum, amt, odate, cnum, snum) VALUES
(3001, 1500.00, '2023-01-15', 2001, 1001),
(3002, 2500.50, '2023-02-10', 2002, 1002),
(3003, 500.00, '2023-03-05', 2003, 1004),
(3004, 1800.75, '2023-04-20', 2004, 1003),
(3005, 3400.00, '2023-05-12', 2005, 1006),
(3006, 875.00, '2023-06-18', 2006, 1007),
(3007, 2999.99, '2023-07-01', 2007, 1005),
(3008, 620.50, '2023-08-22', 2008, 1002),
(3009, 1520.00, '2023-09-10', 2009, 1006),
(3010, 4500.75, '2023-10-25', 2005, 1006),
(3011, 2900.00, '2023-10-05', 2010, 1005),
(3012, 750.00, '2023-10-11', 2009, 1006),
(3013, 1300.25, '2023-11-15', 2002, 1002),
(3014, 1650.90, '2023-12-01', 2001, 1001);
