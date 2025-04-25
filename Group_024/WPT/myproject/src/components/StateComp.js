import React, { Component } from 'react'

class StateComp extends Component {

    constructor() {
        super();
        this.state = {
            name: "Panchashil",
            salary: 20000
        }
    }
    
    changeState() {
        //this.setState({name:"Panchashil Wankhede",salary:this.state.salary+5000});

        this.setState((prevState) => ({ name: "Panchashil Wankhede", salary: prevState.salary + 5000 }));

    }

    render() {
        return (
            <div>
                <h2>This is StateComp</h2>
                <p>
                    My Name is :<strong>{this.state.name}</strong> <br />
                    My Salary is :<strong>{this.state.salary}</strong> <br />
                </p>
                <button type='button' onClick={() => this.changeState()}>Change State Data</button>

                <h2 onMouseOver={() => this.setState({ name: "Panchashil Wankhede", salary: this.state.salary + 5000 })}>Hover on me</h2>
            </div>
        )
    }
}

export default StateComp
