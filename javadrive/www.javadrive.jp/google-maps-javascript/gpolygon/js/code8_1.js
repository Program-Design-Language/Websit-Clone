/* Google Maps APIサンプル */

var polygon;

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(43.555018,142.386932), 8);

    var points = [
      new GLatLng(44.19599,142.421265),
      new GLatLng(43.082931,141.459961),
      new GLatLng(42.910172,143.250732),
      new GLatLng(44.19599,142.421265)
    ];

    polygon = new GPolygon(points, "#0000ff", 5, 0.5, "#f0e68c", 0.5);
    map.addOverlay(polygon);
  }
}

function insertPoint() {
  var index = parseInt(document.getElementById("insertindex").value);
  var lat = parseFloat(document.getElementById("latval").value);
  var lng = parseFloat(document.getElementById("lngval").value);

  polygon.insertVertex(index, new GLatLng(lat, lng));
}

function deletePoint() {
  var index = parseInt(document.getElementById("deleteindex").value);

  polygon.deleteVertex(index);
}
