/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(33.588955,130.420632), 15);

    var copyrights = new GCopyrightCollection();
    var tilelayer = new GTileLayer(copyrights, 0, 19);

    tilelayer.getTileUrl = function(tile, zoom) {
      if (tile.x == 28255 && tile.y == 13134 && zoom == 15){
        return "img/tilea.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gtilelayer/js/img/tilea.png*/;
      }else{
        return "img/tileb.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/gtilelayer/js/img/tileb.png*/;
      }
    };
    tilelayer.isPng = function() { return true; };
    tilelayer.getOpacity = function() { return 0.3; };

    var tileoverlay = new GTileLayerOverlay(tilelayer);

    map.addOverlay(tileoverlay);
  }
}
