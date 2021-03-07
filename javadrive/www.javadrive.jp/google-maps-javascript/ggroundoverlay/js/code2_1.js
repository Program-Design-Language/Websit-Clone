/* Google Maps APIサンプル */

var map;
var goverlay;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(34.296863,136.822872), 12);

    var sw = new GLatLng(34.294594,136.77103);
    var ne = createNELatLng(sw, 200, 200);

    var bounds = new GLatLngBounds(sw, ne);
    goverlay = new GGroundOverlay("img/wait.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ggroundoverlay/js/img/wait.png*/, bounds);

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

function onoff() {
  if (goverlay.isHidden()){
    goverlay.show();
    document.getElementById("onoffbtn").value = "非表示";
  }else{
    goverlay.hide();
    document.getElementById("onoffbtn").value = "表示";
  }
}
