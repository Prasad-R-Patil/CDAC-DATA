import 'dotenv/config'

import http from 'http';
import fs from 'fs';

const host = process.env.HOST;
const port = process.env.PORT;

let myserver = http.createServer((req,res)=>{
  if(req.url=="/" || req.url=="/home"){
    // res.write("Hello My Dear Friends");
    // res.end();
    let myReadableStream = fs.createReadStream("./index.html","utf8");
    myReadableStream.pipe(res);
  }
  
  if(req.url=="/about"){
    // res.write("About Page");
    // res.end();
    let myReadableStream = fs.createReadStream("./about.html","utf8");
    myReadableStream.pipe(res);
  }
  if(req.url=="/contact"){
    // res.write("Contact Page");
    // res.end();
    let myReadableStream = fs.createReadStream("./contact.html","utf8");
    myReadableStream.pipe(res);
  }
  if(req.url=="/service"){
    let myReadableStream = fs.createReadStream("./service.html","utf8");
    myReadableStream.pipe(res);
  }
  if(req.url=="/galary"){
    let myReadableStream = fs.createReadStream("./galary.html","utf8");
    myReadableStream.pipe(res);
  }
});

myserver.listen(port,()=>{
    console.log(`my server get started on ${host}:${port}`);
});
