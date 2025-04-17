DROP PROCEDURE IF EXISTS addQualification;
DELIMITER $$

CREATE PROCEDURE addQualification(
    IN sid INT,
    IN sqid INT,
    IN name VARCHAR(20),
    IN college VARCHAR(200),
    IN university VARCHAR(220),
    IN marks VARCHAR(20),
    IN year INT,
    OUT resultm VARCHAR(500)
)
BEGIN
    -- Declare a variable to check the existence of studentID
    DECLARE studentid_exist INT;

    -- Check if the studentID exists in the STUDENT table
    SELECT COUNT(*) INTO studentid_exist FROM student WHERE id = sid;

    IF studentid_exist > 0 THEN
        -- If studentID exists, insert into STUDENT_QUALIFICATION
        INSERT INTO student_qualifications VALUES (sqid, sid, name, college, university, marks, year);

        -- Set output message to indicate success
        SET resultm = 'Record inserted SUCCESSFULLY';
    ELSE
        -- If studentID does not exist, set output message
        SET resultm = 'Student ID not found';
    END IF;
END$$

DELIMITER ;
