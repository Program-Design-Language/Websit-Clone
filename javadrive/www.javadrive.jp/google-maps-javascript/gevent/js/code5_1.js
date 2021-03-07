/* Google Maps APIサンプル */

var map;
var ctrl;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.676856,139.77356), 14);

    ctrl = null;

    GEvent.addListener(map, "mouseover", mouseoverAction);
    GEvent.addListener(map, "mouseout", mouseoutAction);
    GEvent.addListener(map, "mousemove", mousemoveAction);
  }
}

function mouseoverAction(latlng){
  if (ctrl == null){
    ctrl = new GLargeMapControl();
    map.addControl(ctrl);
  }
}

function mouseoutAction(latlng){
  if (ctrl != null){
    map.removeControl(ctrl);
    ctrl = null;
  }
}

function mousemoveAction(latlng){
  document.getElementById("lat").value = latlng.lat();
  document.getElementById("lng").value = latlng.lng();
}
