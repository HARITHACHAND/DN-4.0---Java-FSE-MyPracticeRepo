
// src/App.js
import React from "react";
import Counter from "./components/Counter";
import SayWelcome from "./components/SayWelcome";
import SyntheticEventButton from "./components/SyntheticEventButton";
import CurrencyConvertor from "./components/CurrencyConvertor";

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Event Handling Examples</h1>
      <Counter />
      <hr />
      <SayWelcome />
      <hr />
      <SyntheticEventButton />
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
