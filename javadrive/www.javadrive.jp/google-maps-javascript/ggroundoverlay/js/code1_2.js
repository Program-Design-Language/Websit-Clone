/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(33.591243,130.412006), 13);

    var sw = new GLatLng(33.58933,130.392866);
    var ne = createNELatLng(sw, 48, 48);

    var bounds = new GLatLngBounds(sw, ne);
    var goverlay = new GGroundOverlay("img/dentaku.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ggroundoverlay/js/img/dentaku.png*/, bounds);

    map.addOverlay(goverlay);
  }
}

function createNELatLng(latlng, w, h){
  var point = map.fromLatLngToContainerPixel(latlng);

  var x = point.x;
  var y = point.y;

  var nelatlng = map.fromContainerPixelToLatLng(new GPoint(x + w, y - h));

  return nelatlng;
}
