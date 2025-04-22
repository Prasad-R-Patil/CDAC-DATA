import chalk from "chalk";
import validator from 'validator';

console.log(chalk.bold.blue("this is use of chalk module"));
console.log(chalk.bold.underline.red("Infoway CDAC"));

let err = chalk.underline.red;
let success = chalk.italic.underline.green;

console.log(err("this is error msg"));
console.log(success("You did it !"));
console.log("================");
// use of validator module 
let str1="MisalPav",str2="VadaPav";
console.log(validator.equals(str1,str2));
str1="MisalPav",str2="MisalPav";
console.log(validator.equals(str1,str2));

let myemail="abc.com";
console.log(validator.isEmail(myemail));
myemail="abc@gmail.com";
console.log(validator.isEmail(myemail));
let data = "";
console.log(validator.isEmpty(data));
 data = "Panchashil";
console.log(validator.isEmpty(data));