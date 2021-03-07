/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(34.98655,135.75531), 13);

    dispPolygon(0.5)
  }
}

function setOpaLevel() {
  map.clearOverlays();

  var opalevel = document.getElementById("opalevel").value;
  dispPolygon(parseFloat(opalevel));
}

function dispPolygon(opalevel){
  var points1 = [
    new GLatLng(34.991261,135.730076),
    new GLatLng(34.997976,135.759945),
    new GLatLng(34.965979,135.772219),
    new GLatLng(34.991261,135.730076)
  ];

  var points2 = [
    new GLatLng(35.003355,135.742607),
    new GLatLng(35.009014,135.770159),
    new GLatLng(34.98604,135.779815),
    new GLatLng(34.963834,135.755997),
    new GLatLng(35.003355,135.742607)
  ];

  var polygon1 = new GPolygon(points1, "#ff0000", 10, 0.5, "#f0e68c", opalevel);
  var polygon2 = new GPolygon(points2, "#0000ff", 20, 0.5, "#008f8f", opalevel);

  map.addOverlay(polygon1);
  map.addOverlay(polygon2);
}
