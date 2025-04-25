require('dotenv').config();
const express = require('express');
const app = express();

const host = process.env.HOST;
const port = process.env.PORT;

//1.default routing
app.get("/",(req,res,next)=>{
    res.send("Welcome You In Product Page");
});
//1.naming routing
app.get("/product",(req,res,next)=>{
    res.send("This is simple get request for product");
});
app.delete("/product",(req,res,next)=>{
    res.send("This is simple delete request for product");
});
app.post("/product",(req,res,next)=>{
    res.send("This is simple post request for product");
});
app.put("/product",(req,res,next)=>{
    res.send("This is simple put request for product");
});

app.listen(port,()=>{
    console.log(`my server get started on ${host}:${port}`)
})