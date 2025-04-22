import prompt from "prompt";

prompt.start();
prompt.get(['username', 'email'], function (err, result) {
  
    if(result.username==="admin" && result.email=="admin@gmail.com"){
             console.log("Login Successfully");
             console.log(`Welcome You:${result.username}`);
    }else{
         console.log("Invalid Crdentails");
    }
    
  });