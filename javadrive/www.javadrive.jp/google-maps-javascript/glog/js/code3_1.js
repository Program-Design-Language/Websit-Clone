/* Google Maps APIサンプル */

var map;
var geocoder;
var platlng;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.310748,139.48534), 14);

    geocoder = new GClientGeocoder();

    GEvent.addListener(map, "click", clickAction);
  }
}

function clickAction(overlay, latlng, overlaylatlng){
  map.addOverlay(new GMarker(latlng));
  platlng = latlng;

  geocoder.getLocations(latlng, dispResult);
}

function dispResult(addresses){
  if (addresses.Status.code == G_GEO_SUCCESS){
    var lat = platlng.lat();
    var lng = platlng.lng();
    var url = "<a href='http://local.google.co.jp/maps?ie=UTF8&z=12&ll=" + lat + "," + lng + "'>";
    url += addresses.Placemark[0].address;
    url += "</a>";
    GLog.writeHtml(url);
  }else{
    alert("データを取得できませんでした");
  }
}
