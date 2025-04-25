import logo from './logo.svg';
import './App.css';
import FunctionComp from './components/FunctionComp';
import ClassComp from './components/ClassComp';
import MethodEventComp from './components/MethodEventComp';
import StateComp from './components/StateComp';
import ConditionalRenComp from './components/ConditionalRenComp';
import CssComp from './components/CssComp';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header> */}
     <h1>Welcome You All In React Sesion</h1>
     {/* <FunctionComp name="Panchashil" post="MERN Stack Developer" />
     <ClassComp name="Tejas" post="Fullstack Stack Developer" /> */}
     {/* <MethodEventComp/> */}
     {/* <StateComp/> */}
     {/* <ConditionalRenComp/> */}
     <CssComp/>
    </div>
  );
}

export default App;
