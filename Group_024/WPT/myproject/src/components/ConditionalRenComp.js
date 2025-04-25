import React, { Component } from 'react'

class ConditionalRenComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            isCod: true
        }
    }

    render() {
        // 1.if else
        let msg = "";
        // if (this.state.isCod) {
        //     //    return <h2>Admin Login Successfully</h2>
        //     msg = "Admin Login Successfully";
        // } else {
        //     // return <h2>User Login Successfully</h2>
        //     msg = "User Login Successfully";
        // }
        // 2.element as variable
        // return <h1>{msg}</h1>

        // 3.ternary operator
        // return (!this.state.isCod) ? <h2>Admin Login Successfully</h2> : <h2>User Login Successfully</h2>

        // 4.short-circuit(&&)
        return this.state.isCod && <h2>Admin Login Successfully</h2>
    }
}

export default ConditionalRenComp
