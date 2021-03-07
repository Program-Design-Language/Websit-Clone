/* Google Maps APIサンプル */

var map;
var geocoder;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(36.004673,137.351074), 5);

    geocoder = new GClientGeocoder();
  }
}

function getAddress() {
  var address = document.getElementById("address").value;
  geocoder.getLocations(address, markAddress);
}

function markAddress(obj){
  if (obj.Status.code == G_GEO_SUCCESS){
    for (var i = 0; i < obj.Placemark.length; i++){
      var lat = obj.Placemark[i].Point.coordinates[1];
      var lng = obj.Placemark[i].Point.coordinates[0];
      var point = new GLatLng(lat, lng)
      var marker = new GMarker(point);
      map.addOverlay(marker);
    }
  }else{
    alert("データを取得できませんでした");
  }
}
