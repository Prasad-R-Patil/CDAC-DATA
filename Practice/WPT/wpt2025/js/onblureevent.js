
function checkUID(){
   
    let userid = document.getElementById("uid").value;
    if(userid.trim()===""){
        //  window.alert("user id is required");
        document.getElementById("uid").style.border="2px solid red";
        document.getElementById("uidErr").innerHTML="user id is required";
        document.getElementById("uidErr").style.color="red";
         return false;
    }else if(!userid.match("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$")){
        document.getElementById("uid").style.border="2px solid red";
        document.getElementById("uidErr").innerHTML="user id must be in proper formate";
        document.getElementById("uidErr").style.color="red";
    }else{
        document.getElementById("uid").style.border="2px solid green";
        document.getElementById("uidErr").innerHTML="";
       
    }
}