-- Drop tables if they exist
DROP TABLE IF EXISTS movie_team;
DROP TABLE IF EXISTS team;
DROP TABLE IF EXISTS movie;

-- Create movie table
CREATE TABLE movie (
    mvno INT PRIMARY KEY,
    mvname VARCHAR(100),
    releaseyear INT
);

-- Create team table
CREATE TABLE team (
    memberno INT PRIMARY KEY,
    membername VARCHAR(100),
    membertype VARCHAR(50)
);

-- Create movie_team table
CREATE TABLE movie_team (
    id INT PRIMARY KEY,
    mvno INT,
    memberno INT,
    FOREIGN KEY (mvno) REFERENCES movie(mvno),
    FOREIGN KEY (memberno) REFERENCES team(memberno)
);

-- Insert movie data
INSERT INTO movie (mvno, mvname, releaseyear) VALUES
(1, 'Sholay', 1975),
(2, 'Shaan', 1980),
(3, 'Don', 1978),
(4, 'Khel Khel Mein', 1975),
(5, 'Trishul', 1978),
(6, 'Deewaar', 1975),
(7, 'Amar Akbar Anthony', 1977),
(8, 'Kabhi Kabhie', 1976),
(9, 'Muqaddar Ka Sikandar', 1978),
(10, 'Silsila', 1981),
(11, 'Zanjeer', 1973),
(12, 'Namak Halaal', 1982);

-- Insert team data
INSERT INTO team (memberno, membername, membertype) VALUES
(1, 'Amitabh Bachchan', 'actor'),
(2, 'Shashi Kapoor', 'actor'),
(3, 'Hema Malini', 'actress'),
(4, 'Ramesh Sippy', 'director'),
(5, 'G. P. Sippy', 'producer'),
(6, 'Zeenat Aman', 'actress'),
(7, 'Neetu Singh', 'actress'),
(8, 'Rishi Kapoor', 'actor'),
(9, 'Yash Chopra', 'director'),
(10, 'Pran', 'actor'),
(11, 'Vinod Khanna', 'actor'),
(12, 'Rekha', 'actress'),
(13, 'Jaya Bhaduri', 'actress'),
(14, 'Manmohan Desai', 'director'),
(15, 'Prakash Mehra', 'producer'),
(16, 'Yash Johar', 'producer'),
(17, 'Smita Patil', 'actress'),
(18, 'Kader Khan', 'actor'),
(19, 'Parveen Babi', 'actress'),
(20, 'Yash Chopra', 'producer');

-- Insert movie_team data
INSERT INTO movie_team (id, mvno, memberno) VALUES
-- Sholay
(1, 1, 1), (2, 1, 2), (3, 1, 3), (4, 1, 4), (5, 1, 5),

-- Shaan
(6, 2, 1), (7, 2, 3), (8, 2, 4), (9, 2, 5),

-- Don
(10, 3, 1), (11, 3, 6),

-- Khel Khel Mein
(12, 4, 1), (13, 4, 7), (14, 4, 8),

-- Trishul
(15, 5, 1), (16, 5, 2), (17, 5, 9),

-- Deewaar
(18, 6, 1), (19, 6, 10),

-- Amar Akbar Anthony
(20, 7, 1), (21, 7, 11), (22, 7, 14), (23, 7, 5),

-- Kabhi Kabhie
(24, 8, 1), (25, 8, 12), (26, 8, 9), (27, 8, 20),

-- Muqaddar Ka Sikandar
(28, 9, 1), (29, 9, 13), (30, 9, 12),

-- Silsila
(31, 10, 1), (32, 10, 12), (33, 10, 13), (34, 10, 9),

-- Zanjeer
(35, 11, 1), (36, 11, 15), (37, 11, 18),

-- Namak Halaal
(38, 12, 1), (39, 12, 19), (40, 12, 17), (41, 12, 16);
