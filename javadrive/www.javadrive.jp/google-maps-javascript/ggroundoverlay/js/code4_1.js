/* Google Maps APIサンプル */

var map;
var soverlay;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.93368,140.673409), 12);

    var screenXY = new GScreenPoint(290, 290);
    var overlayXY = new GScreenPoint(0, 0);
    var size = new GScreenSize(100, 100);

    soverlay = new GScreenOverlay("img/sun.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ggroundoverlay/js/img/sun.png*/, screenXY, overlayXY, size);

    map.addOverlay(soverlay);
  }
}

function onoff() {
  if (soverlay.isHidden()){
    soverlay.show();
    document.getElementById("onoffbtn").value = "非表示";
  }else{
    soverlay.hide();
    document.getElementById("onoffbtn").value = "表示";
  }
}
