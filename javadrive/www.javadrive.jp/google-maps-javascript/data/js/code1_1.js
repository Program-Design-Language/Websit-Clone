/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map"));
    map.addControl(new GMapTypeControl());
    map.addControl(new GLargeMapControl());
    map.setCenter(new GLatLng(36.13787471840729, 138.603515625), 6);

    GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/pref.json", createMap);
  }
}

function createMap(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var selectHtml = "";
  selectHtml += "<form>";
  selectHtml += "<select id='pref' onChange='selectPref()'>";
  selectHtml += "<option value='0'>選択してください</option>";

  for (var i = 0; i < json.marker.length; i++) {
    var pref = json.marker[i].pref;
    var url = json.marker[i].url;
    var addr = json.marker[i].addr;
    var lat = json.marker[i].lat;
    var lng = json.marker[i].lng;

    var marker = createMarker(pref, url, addr, lat, lng)
    map.addOverlay(marker);

    selectHtml += "<option value='" + lat + "," + lng + "'>" + pref + "</option>";
  }

  selectHtml += "</select>";
  selectHtml += "</form>";

  document.getElementById("selectMenu").innerHTML = selectHtml;
}

function createMarker(pref, url, addr, lat, lng){
  var marker = new GMarker(new GLatLng(lat, lng));

  var html = "";
  html += "<p><a href='" + url + "'>" + pref + "</a></p>";
  html += "<p>" + addr + "</p>";

  GEvent.addListener(marker, "click", function(){
    marker.openInfoWindowHtml(html);
  });

  return marker;
}

function selectPref(){
  var val = document.getElementById("pref").value;

  if (val != "0"){
    var latlng = val.split(",");
    var lat = latlng[0];
    var lng = latlng[1];

    map.setCenter(new GLatLng(lat, lng), 14);
  }
}
