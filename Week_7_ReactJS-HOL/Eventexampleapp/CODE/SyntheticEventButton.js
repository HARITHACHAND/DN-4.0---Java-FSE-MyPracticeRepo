// src/components/SyntheticEventButton.js
import React from "react";

function SyntheticEventButton() {
  const handleClick = (event) => {
    console.log("Synthetic Event object:", event);
    alert("I was clicked");
  };

  return (
    <div>
      <button onClick={handleClick}>OnPress</button>
    </div>
  );
}

export default SyntheticEventButton;
