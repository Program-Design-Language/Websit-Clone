/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(33.261657,129.885864);
  var opts = {
    zoom: 8,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    disableDoubleClickZoom: false
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function toEnable() {
  var opts = {
    disableDoubleClickZoom: false
  };

  map.setOptions(opts);
}

function toDisable() {
  var opts = {
    disableDoubleClickZoom: true
  };

  map.setOptions(opts);
}
