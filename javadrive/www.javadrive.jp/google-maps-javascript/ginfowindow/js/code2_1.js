/* Google Maps APIサンプル */

var map;
var infowindow;

function initialize() {
  var latlng = new google.maps.LatLng(33.852054,132.786405);
  var opts = {
    zoom: 16,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  infowindow = new google.maps.InfoWindow({
    content: '道後温泉本館',
    position: latlng
  });
}

function doOpen() {
  infowindow.open(map);
}

function doClose() {
  infowindow.close();
}
