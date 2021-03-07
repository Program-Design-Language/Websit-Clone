/* Google Maps APIサンプル */

var map;
var startPoint;
var soverlay;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.676856,139.77356), 14);

    GEvent.addListener(map, "dragstart", dragstartAction);
    GEvent.addListener(map, "dragend", dragendAction);
    GEvent.addListener(map, "drag", dragAction);
  }
}

function dragstartAction(){
  startPoint = map.getCenter();
  var marker = new GMarker(startPoint);
  map.addOverlay(marker);

  var screenXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
  var overlayXY = new GScreenPoint(0.5, 0.5, "fraction", "fraction");
  var size = new GScreenSize(101, 101);

  soverlay = new GScreenOverlay("img/cross.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gevent/js/img/cross.png*/, screenXY, overlayXY, size);
  map.addOverlay(soverlay);
}

function dragendAction(){
  var endPoint = map.getCenter();
  var marker = new GMarker(endPoint);
  map.addOverlay(marker);

  var polyline = [];
  polyline.push(new GPoint(startPoint.lng(), startPoint.lat()));
  polyline.push(new GPoint(endPoint.lng(), endPoint.lat()));
  var line = new GPolyline(polyline);
  map.addOverlay(line);

  map.removeOverlay(soverlay);
}

function dragAction(){
  var nowPoint = map.getCenter();

  var points = [];
  points.push(startPoint);
  points.push(nowPoint);
  var line = new GPolyline(points);
  map.addOverlay(line);

  startPoint = nowPoint;
}
