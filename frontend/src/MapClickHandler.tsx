import { useMapEvents } from "react-leaflet";

function MapClickHandler() {
    useMapEvents({
        click(e) {
            console.log('Latitude', e.latlng.lat);
            console.log('Longitude', e.latlng.lng);
        },
    });

    return null;
}

export default MapClickHandler;