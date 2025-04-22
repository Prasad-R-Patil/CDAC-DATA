import {addition,subtraction,multiplication,division,myName} from './arithmatic.mjs';
// import { Employee } from './class.mjs';
import  Employee  from './class.mjs';

console.log(myName);
console.log(addition(30,20));
console.log(subtraction(30,20));
console.log(multiplication(30,20));
console.log(division(30,20));

let empObj =new Employee(501,"Mayur","CEO",50000);
 empObj.empDetails()