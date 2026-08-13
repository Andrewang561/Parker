import { useState } from 'react'
import { MapContainer, TileLayer } from 'react-leaflet'
import './App.css'
import MapClickHandler from './MapClickHandler';

function App() {

  return (
      <MapContainer
        center={[49.2827, -123.1207]}
        zoom={13}
        style={{ height: '100vh', width: '100%' }}
      >
        <TileLayer
          attribution='&copy; OpenStreetMap contributors'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />
        <MapClickHandler />
      </MapContainer>
    );
}

export default App
