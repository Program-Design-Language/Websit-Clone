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
  var latlngs = createRectangle(point, 100, 80);

  var polygon = new GPolygon(latlngs, "#ff0000", 5, 0.5, "#0000ff", 0.1);
  map.addOverlay(polygon);
}

function createRectangle(latlng, w, h){
  var point = map.fromLatLngToContainerPixel(latlng);

  var x = point.x;
  var y = point.y;

  var latlng1 = map.fromContainerPixelToLatLng(new GPoint(x - w / 2, y - h / 2));
  var latlng2 = map.fromContainerPixelToLatLng(new GPoint(x + w / 2, y - h / 2));
  var latlng3 = map.fromContainerPixelToLatLng(new GPoint(x + w / 2, y + h / 2));
  var latlng4 = map.fromContainerPixelToLatLng(new GPoint(x - w / 2, y + h / 2));

  var latlngs = [];
  latlngs.push(latlng1);
  latlngs.push(latlng2);
  latlngs.push(latlng3);
  latlngs.push(latlng4);
  latlngs.push(latlng1);

  return latlngs;
}
