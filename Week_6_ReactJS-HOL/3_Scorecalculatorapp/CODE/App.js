import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore 
        name="Haritha J C" 
        school="RMD Engineering College" 
        total={450} 
        goal={5} 
      />
    </div>
  );
}

export default App;
