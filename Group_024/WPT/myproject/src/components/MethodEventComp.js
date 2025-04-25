import React, { Component } from 'react'

class MethodEventComp extends Component {

    greet() {
        window.alert("Good Morning Everyone");
    }
    welcome(...std) {
        window.alert(`Welcome You ${std} In Infoway`);
    }
    render() {
        return (
            <div>
                <h2>This is MethodEventComp</h2>
                <button type='button' onClick={() => this.greet()}>Greet</button>
                <h2 onMouseOver={() => this.welcome("Tejas", "Rupesh","Prasad","Viraj")}>Hover on me to call welcome</h2>
            </div>
        )
    }
}

export default MethodEventComp
