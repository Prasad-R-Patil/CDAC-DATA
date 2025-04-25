require('dotenv').config();
const express = require('express');
const path = require('path');
const hbs = require('hbs');

const app = express();
const host = process.env.HOST;
const port = process.env.PORT;
// static  file path
const staticFilePath = path.join(__dirname,"/public");

//path for acess hbs views file
const viewsPath = path.join(__dirname,"/templates/views");
const partialsPath = path.join(__dirname,"/templates/partials");

// use of express.static middleware
app.use(express.static(staticFilePath));

// we define what template engine we are using
app.set('view engine', 'hbs');
app.set("views",viewsPath);

hbs.registerPartials(partialsPath);

app.get("/home",(req,res,next)=>{
    // res.send("this is Home Page.");
    res.render("index",{
        title:"Home",
        company:"Hematite Infotech Pvt Ltd"
    })
});
app.get("/about",(req,res,next)=>{
    // res.send("this is About Page.");
    res.render("about",{
         title:"About",
         company:"Google"
    })
});
app.get("/sevice",(req,res,next)=>{
    res.send("this is Service Page.");
});
app.get("/contact",(req,res,next)=>{
    res.send("this is Contact Page.");
});
app.get("*d",(req,res,next)=>{
    res.send("404 page not found");
});

app.listen(port,()=>{
    console.log(`My Web Server get started on ${host}:${port}`);
})