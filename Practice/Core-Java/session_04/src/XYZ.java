// Base class
class Faculty {
    int facultyId;
    double salary;

    Faculty(int facultyId) {
        this.facultyId = facultyId;
    }

    void display() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Salary: " + salary);
    }
}

// FullTimeFaculty class inherits Faculty
class FullTimeFaculty extends Faculty {
    double basic;
    double allowance;

    FullTimeFaculty(int facultyId, double basic, double allowance) {
        super(facultyId);
        this.basic = basic;
        this.allowance = allowance;
        calculateSalary();
    }

    void calculateSalary() {
        salary = basic + allowance;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Basic Pay: " + basic);
        System.out.println("Allowance: " + allowance);
    }
}

// PartTimeFaculty class inherits Faculty
class PartTimeFaculty extends Faculty {
    int hours;
    double rate;

    PartTimeFaculty(int facultyId, int hours, double rate) {
        super(facultyId);
        this.hours = hours;
        this.rate = rate;
        calculateSalary();
    }

    void calculateSalary() {
        salary = hours * rate;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hours);
        System.out.println("Hourly Rate: " + rate);
    }
}

// Class with main method
class XYZ {
    public static void main(String[] args) {
        // Storing 2 full-time faculty data
        FullTimeFaculty fullTime1 = new FullTimeFaculty(101, 50000, 15000);
        FullTimeFaculty fullTime2 = new FullTimeFaculty(102, 45000, 12000);

        // Storing 2 part-time faculty data
        PartTimeFaculty partTime1 = new PartTimeFaculty(201, 30, 500);
        PartTimeFaculty partTime2 = new PartTimeFaculty(202, 25, 600);

        // Printing details of all faculty members
        System.out.println("Full-Time Faculty Details:");
        fullTime1.display();
        System.out.println();
        fullTime2.display();
        System.out.println();

        System.out.println("Part-Time Faculty Details:");
        partTime1.display();
        System.out.println();
        partTime2.display();
    }
}
