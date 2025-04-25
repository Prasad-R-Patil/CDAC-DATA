require('dotenv').config();
const express = require('express');
const mysql = require('mysql');
const bodyParser = require('body-parser');
const connection = require('./db');
const cors = require('cors');

const app = express();

const host = process.env.HOST;
const port = process.env.PORT;

app.use(cors());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.get("/", (req, res, next) => {
    res.send("Welcome In REST API");
});

// this get api will return all product data
app.get("/products", (req, res, next) => {
    // res.send("get request for product");

    connection.query('SELECT * FROM products', (error, result) => {
        if (error) throw error;
        res.json(result);
    });
});
// this get api will return single product data
app.get("/products/:id", (req, res, next) => {
    // res.send(`get request for single product id:${req.params.id}`);
    connection.query(`SELECT * FROM products WHERE id=${req.params.id}`, (error, result) => {
        if (error) throw error;
        res.json(result);
    })
});

// this delete api will return all product data
app.delete("/products/:id", (req, res, next) => {
    // res.send(`delete request for single product id:${req.params.id}`);
    connection.query(`DELETE FROM products WHERE id=${req.params.id}`, (error, result) => {
        if (error) throw error;
        res.json("Products deleted successfully");
    })
});

// this post api will return all product data
app.post("/products", (req, res, next) => {
    // res.send("post request for product");
    const { name, price, company, quantity } = req.body;
    const sqlquery = "INSERT INTO products (name,price,company,quantity) VALUES(?,?,?,?)";

    connection.query(sqlquery, [name, price, company, quantity], (error, result) => {
        if (error) throw error;
        res.json("Product Added Successfully");
    })
});

// this put api will return all product data
app.put("/products/:id", (req, res, next) => {
    // res.send("get request for product");
    const { id } = req.params;
    const { name, price, company, quantity } = req.body;
    const sqlquery = `UPDATE products SET name=?, price=?, company=?, quantity=? WHERE id=${id}`;

    connection.query(sqlquery,[name,price,company,quantity],(error,result)=>{
        if(error) throw error;
        res.json("Product Updated Successfully");
    })

});

app.listen(port, () => {
    console.log(`my rest api server started on ${host}:${port}`);
})

