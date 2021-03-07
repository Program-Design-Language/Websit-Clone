/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(35.705576,139.751952);
  var opts = {
    zoom: 16,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    navigationControl: false
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + map.getZoom();
}

function zoomIn() {
  var level = map.getZoom();
  level ++;
  map.setZoom(level);
  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + level;
}

function zoomOut() {
  var level = map.getZoom();
  if (level != 0){
    level --;
  }
  map.setZoom(level);
  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + level;
}
