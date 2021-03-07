/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(33.591243,130.412006), 13);

    var sw = new GLatLng(33.58933,130.392866);
    var ne = new GLatLng(33.606086,130.402694);
    var bounds = new GLatLngBounds(sw, ne);
    var goverlay = new GGroundOverlay("img/dentaku.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ggroundoverlay/js/img/dentaku.png*/, bounds);

    map.addOverlay(goverlay);
  }
}
