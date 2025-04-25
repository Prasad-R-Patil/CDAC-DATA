import react, { Component } from "react";

class ClassComp extends Component{

    render(){
        return (
            <div>
                <h1>This is Class Component</h1>
                <p>My Name is :<ins>{this.props.name}</ins> ,I am : <ins>{this.props.post}</ins> </p>
            </div>
        )
    }
}

export default ClassComp;