import fs from 'fs';

// write file synchronously
// fs.writeFileSync("writeFile.txt","Good Afternoon You all");
// //read data synchronously
// let readData = fs.readFileSync("./readOne.txt","utf8");
// console.log(readData);
// // append data synchronously
// fs.appendFileSync("./writeFile.txt"," You All Are Bright Student")

// write file asynchronously
fs.writeFile("./writeFileTwo.txt","This is Nodejs Session",(err,res)=>{});

// read file asynchronously
fs.readFile("./writeFile.txt","utf8",(err,res)=>{
    console.log(res);
});

// read file and write data into another file asynchronously
fs.readFile("./writeFile.txt","utf8",(err,res)=>{
    fs.writeFile("./writeFileThree.txt",res,(err,res)=>{})
});

