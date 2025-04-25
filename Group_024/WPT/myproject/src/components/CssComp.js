import React from 'react';
import './external.css';
import mycss from './mycss.module.css';

const CssComp = () => {

    let cssobj={
        color:"red",
        backgroundColor:"gray",
        fontFamily:"cursive"
    }
    return (
        <div>
            {/* 1.internal css  */}
            <h2 style={{color:"blue",backgroundColor:"aqua"}}>This is Css components</h2>
            <h2 style={cssobj}>we are CDAC Studnts</h2>
            {/* 2.external css */}
            <p className='txtPrimary'>Panchashil Wankhede</p>
            <p className='txtSuccess'>infoway CDAC</p>
            {/* 3.module css  */}
            <div className={mycss.box}>Hello</div>
        </div>
    )
}

export default CssComp
