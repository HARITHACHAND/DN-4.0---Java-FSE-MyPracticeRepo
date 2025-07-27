// src/components/CohortDetails.js
import React from 'react';
import styles from '../styles/CohortDetails.module.css';

function CohortDetails({ name, trainer, status }) {
  const color = status === "ongoing" ? "green" : "blue";

  return (
    <div className={styles.box}>
      <h3 style={{ color }}>{name}</h3>
      <dl>
        <dt>Trainer</dt>
        <dd>{trainer}</dd>
        <dt>Status</dt>
        <dd>{status}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
