/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(34.98655,135.75531), 13);

    var copyrights = new GCopyrightCollection();

    var tilelayer1 = new GTileLayer(copyrights, 0, 19);

    tilelayer1.getTileUrl = function(tile, zoom) { return "img/tilec.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gtilelayer/js/img/tilec.png*/; };
    tilelayer1.isPng = function() { return true; };
    tilelayer1.getOpacity = function() { return 0.5; };
    var opts1 = {zPriority:10};

    var tilelayer2 = new GTileLayer(copyrights, 0, 19);

    tilelayer2.getTileUrl = function(tile, zoom) { return "img/tiled.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gtilelayer/js/img/tiled.png*/; };
    tilelayer2.isPng = function() { return true; };
    tilelayer2.getOpacity = function() { return 0.8; };
    var opts2 = {zPriority:20};

    var tileoverlay1 = new GTileLayerOverlay(tilelayer1, opts1);
    var tileoverlay2 = new GTileLayerOverlay(tilelayer2, opts2);

    map.addOverlay(tileoverlay2);
    map.addOverlay(tileoverlay1);
  }
}
