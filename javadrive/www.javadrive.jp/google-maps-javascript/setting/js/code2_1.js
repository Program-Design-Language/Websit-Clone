/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(33.495669,133.573794);
  var opts = {
    zoom: 17,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    draggable: true
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toEnable() {
  var opts = {
    draggable: true
  };

  map.setOptions(opts);
}

function toDisable() {
  var opts = {
    draggable: false
  };

  map.setOptions(opts);
}
