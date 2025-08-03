import React from "react";

const IndianPlayers = () => {
  const allPlayers = ["Virat", "Rohit", "Dhoni", "Sachin", "Yuvraj", "Sehwag", "Jadeja", "Ashwin"];

  const oddTeam = allPlayers.filter((_, i) => i % 2 === 0);
  const evenTeam = allPlayers.filter((_, i) => i % 2 !== 0);

  const T20players = ["Virat", "Rohit", "Jadeja"];
  const RanjiTrophy = ["Pujara", "Rahane", "Saha"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
