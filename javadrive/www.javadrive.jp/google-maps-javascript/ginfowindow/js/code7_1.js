/* Google Maps APIサンプル */

var map;

function initialize() {
  var latlng = new google.maps.LatLng(35.47154,139.627175);
  var opts = {
    zoom: 14,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}

function openAkarenga() {
  var iw_latlng = new google.maps.LatLng(35.45242,139.64314);
  var infowindow = new google.maps.InfoWindow({
    content: '赤レンガ倉庫',
    position: iw_latlng,
    disableAutoPan: true
  });

  infowindow.open(map);
}

function openYamashita() {
  var iw_latlng = new google.maps.LatLng(35.447753,139.646745);
  var infowindow = new google.maps.InfoWindow({
    content: '山下公園',
    position: iw_latlng,
    disableAutoPan: false
  });

  infowindow.open(map);
}
