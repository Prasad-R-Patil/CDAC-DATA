import http from 'http';

let myserver = http.createServer((req,res)=>{
  if(req.url=="/"){
    res.write("Hello My Dear Friends");
    res.end();
  }
  if(req.url=="/home"){
    res.write("Home Page");
    res.end();
  }
  if(req.url=="/about"){
    res.write("About Page");
    res.end();
  }
  if(req.url=="/contact"){
    res.write("Contact Page");
    res.end();
  }
});

myserver.listen(5555,()=>{
    console.log("my server get started");
})
