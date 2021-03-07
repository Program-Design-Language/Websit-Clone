/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(36.049932,138.086128);
  var opts = {
    zoom: 2,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toAustralia() {
  var ll_sw = new google.maps.LatLng(-44.087585,109.335938);
  var ll_ne = new google.maps.LatLng(-4.565474,157.851563);
  var latLngBounds = new google.maps.LatLngBounds(ll_sw, ll_ne);

  map.panToBounds(latLngBounds);
}

function toEuropa() {
  var ll_sw = new google.maps.LatLng(31.653381,-19.6875);
  var ll_ne = new google.maps.LatLng(74.019543,48.164063);
  var latLngBounds = new google.maps.LatLngBounds(ll_sw, ll_ne);

  map.panToBounds(latLngBounds);
}

function toSAmerica() {
  var ll_sw = new google.maps.LatLng(-58.447733,-96.328125);
  var ll_ne = new google.maps.LatLng(17.308688,-29.882812);
  var latLngBounds = new google.maps.LatLngBounds(ll_sw, ll_ne);

  map.panToBounds(latLngBounds);
}
