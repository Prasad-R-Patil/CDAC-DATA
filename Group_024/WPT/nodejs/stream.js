// const fs= require('fs');
import fs from 'fs'

let myReadStream = fs.createReadStream("./writeFileThree.txt","utf8");
let myWriteStream = fs.createWriteStream("./writeFileFour.txt");

myReadStream.on("data",(chunk)=>{
   myWriteStream.write(chunk);
});

