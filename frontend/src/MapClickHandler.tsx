import { useMapEvents } from "react-leaflet";

function MapClickHandler() {
    useMapEvents({
        async click(e) {
            const latitude = e.latlng.lat;
            const longitude = e.latlng.lng;
            console.log('Latitude', latitude);
            console.log('Longitude', longitude);
            
            const response = await fetch(
                `http://localhost:8080/api/parking?lat=${latitude}&lng=${longitude}`
            )

            const data = await response.json();
            console.log(data);
        },
    });

    return null;
}

export default MapClickHandler;