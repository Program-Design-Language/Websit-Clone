/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(39.848876,140.997849), 10);

    GEvent.addListener(map, "click", clickAction);
  }
}

function clickAction(overlay, latlng, overlaylatlng){
  map.addOverlay(new GMarker(latlng));
}

function deleteEventHandler() {
  GEvent.clearListeners(map, "click");
}
