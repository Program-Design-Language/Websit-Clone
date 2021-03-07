/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(35.300241,139.481263);
  var opts = {
    zoom: 13,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    scrollwheel: true
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toEnable() {
  var opts = {
    scrollwheel: true
  };

  map.setOptions(opts);
}

function toDisable() {
  var opts = {
    scrollwheel: false
  };

  map.setOptions(opts);
}
