// src/components/CurrencyConvertor.js
import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState(null);
  const conversionRate = 0.011; // Example rate: 1 INR = 0.011 EUR

  const handleSubmit = (e) => {
    e.preventDefault();
    const converted = parseFloat(rupees) * conversionRate;
    setEuros(converted.toFixed(2));
  };

  return (
    <div>
      <h3>Currency Convertor</h3>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
        />
        <button type="submit">Convert</button>
      </form>
      {euros !== null && <p>{rupees} INR = €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
