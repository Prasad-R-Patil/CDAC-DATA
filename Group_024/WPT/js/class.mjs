
// this is class 
class Employee {
    // data memeber 
    eid = 101;
    ename = "Suraj";
    epost = "Manager";
    esal = 150000;

    constructor(id,name,post,salary){
     this.eid = id;
     this.ename = name;
     this.epost =post;
     this.esal =salary;
    }
    // member function 
    empDetails() {
        console.log(`Id:${this.eid} Name:${this.ename} Post:${this.epost} Salary:${this.esal}`);
    }
}

export default Employee;
// create object 
// let empObj =new Employee();
// empObj.empDetails()


