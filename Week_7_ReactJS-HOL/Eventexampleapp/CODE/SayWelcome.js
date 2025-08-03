// src/components/SayWelcome.js
import React from "react";

function SayWelcome() {
  const greet = (message) => {
    alert(message);
  };

  return (
    <div>
      <button onClick={() => greet("Welcome!")}>Say Welcome</button>
    </div>
  );
}

export default SayWelcome;
