/* Google Maps APIサンプル */

var map;
var manager;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map"));
    map.addControl(new GMapTypeControl());
    map.addControl(new GLargeMapControl());
    map.setCenter(new GLatLng(36.13628,138.604202), 5, G_SATELLITE_MAP);

    manager = new GMarkerManager(map);

    GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/lake-30.json", createMap);
  }
}

function createMap(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var selectHtml = "";
  selectHtml += "<form>";
  selectHtml += "<select id='lakename' onChange='selectLake()'>";
  selectHtml += "<option value='0'>選択してください</option>";

  for (var i = 0; i < json.marker.length; i++) {
    var id = json.marker[i].id;
    var lakename = json.marker[i].lakename;
    var lat = json.marker[i].lat;
    var lng = json.marker[i].lng;

    var marker = createMarker(id, lakename, lat, lng)
    manager.addMarker(marker, 0, 10);

    selectHtml += "<option value='" + lat + "," + lng + "'>"
    selectHtml += lakename;
    selectHtml += "</option>";
  }

  selectHtml += "</select>";
  selectHtml += "</form>";
  document.getElementById("lake").innerHTML = selectHtml;
}

function createMarker(id, lakename, lat, lng){
  var marker = new GMarker(new GLatLng(lat, lng));

  var html = "<p>[" + id + "] " + lakename + "</p>";

  GEvent.addListener(marker, "click", function(){
    marker.openInfoWindowHtml(html);
  });

  return marker;
}

function selectLake(obj){
  var val = document.getElementById("lakename").value;

  if (val != "0"){
    var latlng = val.split(",");
    var lat = latlng[0];
    var lng = latlng[1];

    map.setCenter(new GLatLng(lat, lng), 10);
  }
}
