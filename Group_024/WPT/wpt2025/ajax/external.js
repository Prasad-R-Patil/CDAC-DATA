//*********get request code **************

let parentEl = document.getElementById("d1");
// step1: create object of XMlHttRequest
let xmlObje = new XMLHttpRequest();

//step2: write callback method to handle response.
xmlObje.onload = function () {
    // console.log(this.responseText);
    let data = JSON.parse(this.responseText);

    for (let d of data) {
        let newRow = document.createElement("tr");
        newRow.innerHTML = `<td>${d.id}</td><td>${d.name}</td><td>${d.price}</td><td>${d.company}</td><td>${d.quantity}</td>`;
        parentEl.appendChild(newRow);
    }
}

// step3: create request by using open method.
xmlObje.open("GET", "http://localhost:8888/products");
//   step4: send request to server 
xmlObje.send();

//*********delete request code **************
function deleteProduct(){
    let id = document.getElementById("pid").value;

    if(window.confirm(`Are you sure to delete product with id:${id}`)){
        let xmlObje = new XMLHttpRequest();
        xmlObje.onload = function (){
         window.alert("Product Delete Successfully");
         }
       xmlObje.open("DELETE",`http://localhost:8888/products/${id}`);
       xmlObje.send();
    }

  }

  //*********post request code **************
 function addProduct(){
     let productObj = {
        name:document.getElementById("txtName").value,
        price:document.getElementById("txtPrice").value,
        company:document.getElementById("txtCompany").value,
        quantity:document.getElementById("txtQuantity").value
     };

     let productJson = JSON.stringify(productObj);
     let xmlObje = new XMLHttpRequest();
     xmlObje.onload = function (){
        window.alert("Product Added Successfully");
        }
        xmlObje.open("POST",`http://localhost:8888/products`);
        xmlObje.send(productJson);
 }


 // code of put request 
 let id;
 function getSingleProduct(){
     id = document.getElementById("prodid").value;
    // console.log(id);
    let xmlObj = new XMLHttpRequest();
    xmlObj.onload = function (){
        // console.log(this.responseText);
        let data = JSON.parse(this.responseText);
        document.getElementById("uName").value = data.name;
        document.getElementById("uPrice").value = data.price;
        document.getElementById("uCompany").value = data.company;
        document.getElementById("uQuantity").value = data.quantity;

    }
    xmlObj.open("GET",`http://localhost:8888/products/${id}`);
    xmlObj.send();
 }

 function updateProduct(){

    let productObj = {
        name:document.getElementById("uName").value,
        price:document.getElementById("uPrice").value,
        company:document.getElementById("uCompany").value,
        quantity:document.getElementById("uQuantity").value
     };
     let productJson = JSON.stringify(productObj);

    let xmlObj = new XMLHttpRequest();
    xmlObj.onload = function (){
        window.alert("Product update successfully");
    }
    xmlObj.open("PUT",`http://localhost:8888/products/${id}`);
    xmlObj.send(productJson);

 }