/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.551362,139.785233), 13);

    var screenXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
    var overlayXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
    var size = new GScreenSize(101, 101);

    var soverlay = new GScreenOverlay("img/cross.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ggroundoverlay/js/img/cross.png*/, screenXY, overlayXY, size);

    map.addOverlay(soverlay);
  }
}
