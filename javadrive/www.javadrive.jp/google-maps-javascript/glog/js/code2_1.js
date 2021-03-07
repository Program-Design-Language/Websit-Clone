/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(34.661346,137.739286), 14);

    GEvent.addListener(map, "click", clickAction);
  }
}

function clickAction(overlay, latlng, overlaylatlng){
  map.addOverlay(new GMarker(latlng));
  GLog.write(latlng.toString());

  var lat = latlng.lat();
  var lng = latlng.lng();
  var url = "http://local.google.co.jp/maps?ie=UTF8&z=12&ll=" + lat + "," + lng;
  GLog.writeUrl(url);
}
