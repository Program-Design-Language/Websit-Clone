/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.758297,139.878488), 15);

    GEvent.addListener(map, "click", clickAction);
  }
}

function downloadData(){
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/gdownloadurl/js/strdata.txt", function dispData(data, statusCode){
    alert(data);
  });
}
