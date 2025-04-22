
import events from 'events';
const em = new events.EventEmitter();

em.on("greet",()=>{
    console.log("my event get execute");
});

em.emit("greet");
