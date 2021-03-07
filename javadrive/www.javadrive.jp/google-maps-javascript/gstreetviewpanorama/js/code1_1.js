/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(38.056742,135.439453), 5);

    var street = new GStreetviewOverlay();

    map.addOverlay(street);
  }
}
