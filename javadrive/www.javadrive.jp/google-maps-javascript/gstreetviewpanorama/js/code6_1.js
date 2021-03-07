/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.665375,139.729593), 18);

    var screenXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
    var overlayXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
    var size = new GScreenSize(101, 101);

    var soverlay = new GScreenOverlay("img/cross.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gstreetviewpanorama/js/img/cross.png*/, screenXY, overlayXY, size);
    map.addOverlay(soverlay);

    var street = new GStreetviewOverlay();
    map.addOverlay(street);

    var slatlng = new GLatLng(35.665375,139.729593);
    var option = { latlng:slatlng };

    var scontainer = document.getElementById("street");
    var panorama = new GStreetviewPanorama(scontainer, option);

    GEvent.addListener(panorama, "initialized", moveMap);
  }
}

function moveMap(loc){
  map.panTo(loc.latlng);
}
