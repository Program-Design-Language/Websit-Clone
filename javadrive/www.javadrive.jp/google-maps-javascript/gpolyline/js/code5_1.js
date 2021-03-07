/* Google Maps APIサンプル */

var line;

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.265804,137.633972), 7);

    var points = [
      new GLatLng(35.687418,139.707642),
      new GLatLng(35.174931,136.900635),
      new GLatLng(34.664841,135.516357)
    ];

    line = new GPolyline(points, "#ff0000");

    map.addOverlay(line);
  }
}

function addLast() {
  line.enableDrawing();
}

function addFirst() {
  var opts = {fromStart:true};
  line.enableDrawing(opts);
}
