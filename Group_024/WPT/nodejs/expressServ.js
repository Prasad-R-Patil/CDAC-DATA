import express from 'express';
let app = express();

app.get("/", (req, res, next) => {
    // res.send("Home page");
    res.sendFile(__dirname+"/index.html");
    // console.log(__dirname)
});
app.get("/home", (req, res, next) => {
    res.send("Home page");
});
app.get("/about", (req, res, next) => {
    res.send("About Page");
});
app.get("/service", (req, res, next) => {
    res.send("Service Page");
});
app.get("/galary", (req, res, next) => {
    res.send("Gallary Page");
});
app.get("/contact", (req, res, next) => {
    res.send("Contact page.");
});
// app.get("/*",(req,res,next)=>{
//     res.send("404... Page not found");
// });  

app.listen(5555, () => {
    console.log("My express server get started");
})




