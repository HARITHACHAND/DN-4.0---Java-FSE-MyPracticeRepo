// src/App.js
import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails name="Java FSE Batch A" trainer="John" status="ongoing" />
      <CohortDetails name="Python Batch B" trainer="Alice" status="completed" />
    </div>
  );
}

export default App;
