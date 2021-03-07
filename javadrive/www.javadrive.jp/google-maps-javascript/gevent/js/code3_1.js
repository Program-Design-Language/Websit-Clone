/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.676856,139.77356), 14);

    GEvent.addListener(map, "click", clickAction);
  }
}

function clickAction(overlay, latlng, overlaylatlng){
  map.addOverlay(new GMarker(latlng));
}

function clickTokyoStation() {
  var latlng = new GLatLng(35.680708,139.767337);
  GEvent.trigger(map, "click", null, latlng, null);
}
