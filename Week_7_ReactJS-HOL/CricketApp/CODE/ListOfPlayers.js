import React from "react";

const ListOfPlayers = () => {
  const players = [
    { name: "Virat", score: 88 },
    { name: "Rohit", score: 56 },
    { name: "Dhoni", score: 75 },
    { name: "Sachin", score: 94 },
    { name: "Yuvraj", score: 65 },
    { name: "Sehwag", score: 70 },
    { name: "Jadeja", score: 45 },
    { name: "Ashwin", score: 85 },
    { name: "Shami", score: 50 },
    { name: "Bumrah", score: 92 },
    { name: "Kohli", score: 77 },
  ];

  const playerList = players.map((player, index) => (
    <li key={index}>
      {player.name} - {player.score}
    </li>
  ));

  const below70 = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h3>Players with score below 70</h3>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
