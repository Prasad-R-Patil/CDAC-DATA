require('dotenv').config();
const express = require('express');
const prompt= require('prompt');

const app = express();
prompt.start();

const host = process.env.HOST;
const port = process.env.PORT;
const user = process.env.USER;
const pass = process.env.PASSWORD;

app.get("/",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/index.html");
});
app.get("/home",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/index.html");
});
app.get("/about",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/about.html");
});
app.get("/service",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/service.html");
});
app.get("/galary",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/galary.html");
});
app.get("/contact",(req,res,next)=>{
    // res.send("home page");
    res.sendFile(__dirname+"/contact.html");
});


prompt.get(['user', 'password'], function (err, result) {
    
    if(result.user===user && result.password===pass){
        app.listen(port,()=>{
            console.log(`My Server get started on ${host}:${port}`);
        })
    }else{
        console.log("You enter invalid credential");
    }

  });

