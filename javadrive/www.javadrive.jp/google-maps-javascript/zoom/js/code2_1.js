/* Google Maps APIサンプル */

var map1;
var map2;

function initialize() {
  var latlng1 = new google.maps.LatLng(35.688551,139.691098);
  var latlng2 = new google.maps.LatLng(35.688551,139.691098);

  var opts1 = {
    zoom: 0,
    center: latlng1,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    mapTypeControl: false,
    navigationControl: false,
    streetViewControl: false
  };

  var opts2 = {
    zoom: 0,
    center: latlng2,
    mapTypeId: google.maps.MapTypeId.SATELLITE,
    mapTypeControl: false,
    navigationControl: false,
    streetViewControl: false
  };

  map1 = new google.maps.Map(document.getElementById("map_canvas1"), opts1);
  map2 = new google.maps.Map(document.getElementById("map_canvas2"), opts2);

  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + map1.getZoom();
}

function zoomIn() {
  var level = map1.getZoom();
  level ++;
  map1.setZoom(level);
  map2.setZoom(level);
  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + level;
}

function zoomOut() {
  var level = map1.getZoom();
  if (level != 0){
    level --;
  }
  map1.setZoom(level);
  map2.setZoom(level);
  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + level;
}
