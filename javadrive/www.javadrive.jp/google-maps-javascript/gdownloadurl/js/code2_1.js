/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(41.764702,140.71671), 13);

    GEvent.addListener(map, "click", clickAction);
  }
}

function downloadData(){
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/gdownloadurl/js/data.txt", function dispData(data, statusCode){
    var lines = data.split("\n");

    for (var i = 0 ; i < lines.length ; i++){
      var vals = lines[i].split(",");

      var lat = vals[0];
      var lng = vals[1];
      var name = vals[2];

      map.addOverlay(createMarker(lat, lng, name));
    }
  });
}

function createMarker(lat, lng, name) {
  var marker = new GMarker(new GLatLng(lat, lng));

  var html = "<p>" + name + "</p>";
  GEvent.addListener(marker, "click", function(){
    marker.openInfoWindowHtml(html);
  });

  return marker;
}
