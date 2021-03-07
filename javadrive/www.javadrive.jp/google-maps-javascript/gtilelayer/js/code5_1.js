/* Google Maps APIサンプル */

var tileoverlay;

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(34.98655,135.75531), 13);

    var copyrights = new GCopyrightCollection();
    var tilelayer = new GTileLayer(copyrights, 0, 19);

    tilelayer.getTileUrl = function(tile, zoom) { return "img/tile.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gtilelayer/js/img/tile.png*/; };
    tilelayer.isPng = function() { return true; };
    tilelayer.getOpacity = function() { return 0.3; };

    tileoverlay = new GTileLayerOverlay(tilelayer);

    map.addOverlay(tileoverlay);
  }
}

function onoff() {
  if (tileoverlay.isHidden()){
    tileoverlay.show();
    document.getElementById("onoffbtn").value = "非表示";
  }else{
    tileoverlay.hide();
    document.getElementById("onoffbtn").value = "表示";
  }
}
