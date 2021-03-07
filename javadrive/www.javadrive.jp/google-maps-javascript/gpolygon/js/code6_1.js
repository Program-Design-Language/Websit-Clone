/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.681143, 139.767079), 14);

    GEvent.addListener(map, "click", addPolygonToMap);
  }
}

function addPolygonToMap(overlay, point){
  var latlngs = createRectangle(point, 70, 32);

  var polygon = new GPolygon(latlngs, "#ff0000", 5, 0.5, "#0000ff", 0.1);
  map.addOverlay(polygon);
}

function createRectangle(latlng, r, n){
  var point = map.fromLatLngToContainerPixel(latlng);

  var x = point.x;
  var y = point.y;

  var latlngs = [];

  for (var i = 0 ; i < n ; i++){
    var px = x + r * Math.cos(i * Math.PI/(n/ 2));
    var py = y + r * Math.sin(i * Math.PI/(n/ 2));
    var latlng = map.fromContainerPixelToLatLng(new GPoint(px, py));

    latlngs.push(latlng);
  }
  latlngs.push(map.fromContainerPixelToLatLng(new GPoint(x + r, y)));

  return latlngs;
}
