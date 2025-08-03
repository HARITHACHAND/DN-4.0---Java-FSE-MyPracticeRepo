import React from "react";
import ListOfPlayers from "./components/ListOfPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const flag = false; // Set to false to test IndianPlayers component

  return (
    <div className="App">
      <h1>Cricket App</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;

