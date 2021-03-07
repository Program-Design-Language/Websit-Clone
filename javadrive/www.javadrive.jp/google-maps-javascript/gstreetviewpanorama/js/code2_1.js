/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.659683,139.742956), 16);

    var street = new GStreetviewOverlay();
    map.addOverlay(street);

    var slatlng = new GLatLng(35.659683,139.742956);
    var option = { latlng:slatlng };
    var scontainer = document.getElementById("street");
    var panorama = new GStreetviewPanorama(scontainer, option);
  }
}
