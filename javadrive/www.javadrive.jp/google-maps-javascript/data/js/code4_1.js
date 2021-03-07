/* Google Maps APIサンプル */

var map;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map"));
    map.addControl(new GMapTypeControl());
    map.addControl(new GLargeMapControl());
    map.setCenter(new GLatLng(35.163801,136.914754), 12);

    var selectHtml ="";
    selectHtml += "<form>";
    selectHtml += "<select id='rosenname' onChange='dispRosen()'>";
    selectHtml += "<option value='0'>選択してください</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-meijyo.json'>名城線</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-tsurumai.json'>鶴舞線</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-higashiyama.json'>東山線</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-sakuradori.json'>桜通線</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-meikou.json'>名港線</option>";
    selectHtml += "<option value='https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-kamiiida.json'>上飯田線</option>";
    selectHtml += "</select>";
    selectHtml += "</form>";
    document.getElementById("rosen").innerHTML = selectHtml;

    dispRosenLine();
  }
}

function dispRosenLine(){
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-meijyo.json", createLineMap);
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-tsurumai.json", createLineMap);
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-higashiyama.json", createLineMap);
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-sakuradori.json", createLineMap);
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-meikou.json", createLineMap);
  GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/ngysubway-kamiiida.json", createLineMap);
}

function createLineMap(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var polyline = [];

  var linecolor = json.linecolor;

  for (var i = 0; i < json.marker.length; i++) {
    var lat = json.marker[i].lat;
    var lng = json.marker[i].lng;
    polyline.push(new GLatLng(lat, lng));
  }

  map.addOverlay(new GPolyline(polyline, linecolor, 10, 0.7));
}

function dispRosen(){
  var val = document.getElementById("rosenname").value;

  if (val != "0"){
    map.clearOverlays();
    dispRosenLine();

    map.setCenter(new GLatLng(35.163801,136.914754), 12);

    GDownloadUrl(val, createMap);
  }
}

function createMap(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var selectHtml = "";
  selectHtml += "<form>";
  selectHtml += "<select id='ekiname' onChange='selectStation()'>";
  selectHtml += "<option value='0'>選択してください</option>";

  for (var i = 0; i < json.marker.length; i++) {
    var id = json.marker[i].id;
    var sta = json.marker[i].sta;
    var url = json.marker[i].url;
    var addr = json.marker[i].addr;
    var lat = json.marker[i].lat;
    var lng = json.marker[i].lng;

    var marker = createMarker(id, sta, url, addr, lat, lng)
    map.addOverlay(marker);

    selectHtml += "<option value='" + lat + "," + lng + "'>"
    selectHtml += sta;
    selectHtml += "</option>";
  }

  selectHtml += "</select>";
  selectHtml += "</form>";
  document.getElementById("eki").innerHTML = selectHtml;
}

function createMarker(id, sta, url, addr, lat, lng){
  var marker = new GMarker(new GLatLng(lat, lng));

  var html = "";
  html += "<p><a href='" + url + "'>" + "[" + id + "]" + sta + "</a></p>";
  html += "<p>" + addr + "</p>";

  GEvent.addListener(marker, "click", function(){
    marker.openInfoWindowHtml(html);
  });

  return marker;
}

function selectStation(obj){
  var val = document.getElementById("ekiname").value;

  if (val != "0"){
    var latlng = val.split(",");
    var lat = latlng[0];
    var lng = latlng[1];

    map.setCenter(new GLatLng(lat, lng), 14);
  }
}
