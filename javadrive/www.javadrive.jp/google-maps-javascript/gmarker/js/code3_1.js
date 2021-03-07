/* Google Maps APIサンプル */

var marker1;
var marker2;
var marker3;

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(41.7724,140.72628), 12);

    var markerIcon = new GIcon();
    markerIcon.image = "img/icon.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gmarker/js/img/icon.png*/;
    markerIcon.shadow = "img/shadow.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gmarker/js/img/shadow.png*/;
    markerIcon.iconSize = new GSize(42, 56);
    markerIcon.shadowSize = new GSize(70, 56);
    markerIcon.iconAnchor = new GPoint(21, 56);
    markerIcon.infoWindowAnchor = new GPoint(21, 28);

    var opts = {icon:markerIcon};

    marker1 = new GMarker(new GLatLng(41.75886,140.703535));
    marker2 = new GMarker(new GLatLng(41.79672,140.757179));
    marker3 = new GMarker(new GLatLng(41.772644,140.725315), opts);

    map.addOverlay(marker1);
    map.addOverlay(marker2);
    map.addOverlay(marker3);
  }
}

function openHakodateyama() {
  html = "<p>函館山</p>";
  marker1.openInfoWindowHtml(html);
}

function openGoryokaku() {
  html = "<p>五稜郭</p>";
  marker2.showMapBlowup(html);
}

function openAsaichi() {
  var tabarray = [
    new GInfoWindowTab("名称", "<p>函館朝市</p>"),
    new GInfoWindowTab("住所", "<p>函館市若松町9-19</p>")
  ];

  marker3.openInfoWindowTabsHtml(tabarray);
}
