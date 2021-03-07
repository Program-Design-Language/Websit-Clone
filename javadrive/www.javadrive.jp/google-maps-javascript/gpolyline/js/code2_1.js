/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(36.870832,139.130859), 6);

    dispPolyline(0.5);
  }
}

function setOpaLevel() {
  map.clearOverlays();

  var opalevel = document.getElementById("opalevel").value;
  dispPolyline(parseFloat(opalevel));
}

function dispPolyline(opalevel){
  var points1 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(35.174931,136.900635),
    new GLatLng(36.060756,136.223602),
    new GLatLng(36.559291,136.656189)
  ];

  var points2 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(36.386466,139.062195),
    new GLatLng(37.906283,139.042969),
    new GLatLng(39.71511,140.103149)
  ];

  var points3 = [
    new GLatLng(37.906283,139.042969),
    new GLatLng(39.704545,141.15509)
  ];

  var line1 = new GPolyline(points1, "#ff0000", 1, opalevel);
  var line2 = new GPolyline(points2, "#0000ff", 10, opalevel);
  var line3 = new GPolyline(points3, "#00ff00", 5, opalevel);

  map.addOverlay(line1);
  map.addOverlay(line2);
  map.addOverlay(line3);
}
