const path = require('path');
const os = require('os');

console.log("this is path module");
console.log(__dirname);
console.log(__filename);

console.log(path.basename(__dirname));
console.log(path.basename(__filename));
console.log(path.extname(__filename));
console.log(path.isAbsolute(__filename));
console.log(path.isAbsolute("../"+__filename));
console.log(path.join("../public/","images/teamimg"));

console.log("++++++++ this is os module +++++++++++++");
console.log(os.hostname());
console.log(os.homedir());
console.log(os.freemem());
console.log(os.totalmem());
console.log(os.type());
console.log(os.arch());