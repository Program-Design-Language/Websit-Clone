/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(36.049932,138.086128);
  var opts = {
    zoom: 12,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toRightTop() {
  map.panBy(250, -150);
}

function toLeftBottom() {
  map.panBy(-1000, 600);
}
