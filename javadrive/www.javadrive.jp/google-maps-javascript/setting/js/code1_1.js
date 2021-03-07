/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(34.370645,134.807739);
  var opts = {
    zoom: 10,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    keyboardShortcuts: true
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toEnable() {
  var opts = {
    keyboardShortcuts: true
  };

  map.setOptions(opts);
}

function toDisable() {
  var opts = {
    keyboardShortcuts: false
  };

  map.setOptions(opts);
}
