/* Google Maps APIサンプル */

var map;
var geocoder;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.169564,136.882782), 16);

    geocoder = new GClientGeocoder();
    GEvent.addListener(map, "click", clickMap);
  }
}

function clickMap(overlay, latlng){
  geocoder.getLocations(latlng, dispResult);
}

function dispResult(addresses){
  if (addresses.Status.code == G_GEO_SUCCESS){
    var place = addresses.Placemark[0];
    document.getElementById("address").value = place.address;
  }else{
    alert("データを取得できませんでした");
  }
}
