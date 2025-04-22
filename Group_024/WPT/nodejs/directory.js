import fs from 'fs';

// remove file asynchronously
fs.unlink('./readOne.txt',(err,res)=>{});

// how to create asynchronously
fs.mkdir("./newDir",(err,res)=>{
    fs.writeFile("./newDir/readFileFour.txt","hello every",(err,res)=>{});
});

// remove directory
fs.rmdir("./newDirTwo",(err,res)=>{});
