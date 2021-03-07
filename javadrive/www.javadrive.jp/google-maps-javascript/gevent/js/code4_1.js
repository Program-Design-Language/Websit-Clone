/* Google Maps APIサンプル */

var map;
var opt1;
var opt2;
var opt3;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.676856,139.77356), 14);

    creatMarker();

    GEvent.addListener(map, "click", clickAction);
    GEvent.addListener(map, "dblclick", dblclickAction);
    GEvent.addListener(map, "singlerightclick", rightClickAction);
  }
}

function clickAction(overlay, latlng, overlaylatlng){
  var marker = new GMarker(latlng, opt1);
  map.addOverlay(marker);
}

function dblclickAction(overlay, latlng){
  var marker = new GMarker(latlng, opt2);
  map.addOverlay(marker);
}

function rightClickAction(point, src){
  var latlng = map.fromContainerPixelToLatLng(point);
  var marker = new GMarker(latlng, opt3);
  map.addOverlay(marker);
}

function creatMarker(){
  var markerIcon1 = new GIcon();
  markerIcon1.image = "img/icon.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gevent/js/img/icon.png*/;
  markerIcon1.shadow = "img/shadow.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gevent/js/img/shadow.png*/;
  markerIcon1.iconSize = new GSize(42, 56);
  markerIcon1.shadowSize = new GSize(70, 56);
  markerIcon1.iconAnchor = new GPoint(21, 56);

  var markerIcon2 = new GIcon(markerIcon1, "img/icon2.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gevent/js/img/icon2.png*/);
  var markerIcon3 = new GIcon(markerIcon1, "img/icon3.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gevent/js/img/icon3.png*/);

  opt1 = {icon:markerIcon1};
  opt2 = {icon:markerIcon2};
  opt3 = {icon:markerIcon3};
}
