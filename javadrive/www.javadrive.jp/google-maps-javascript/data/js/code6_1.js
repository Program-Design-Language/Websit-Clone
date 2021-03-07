/* Google Maps APIサンプル */

var map;
var rosenName = [];
var rosenFile= [];
var rosenCount= [];

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map"));
    map.addControl(new GMapTypeControl());
    map.addControl(new GLargeMapControl());
    map.setCenter(new GLatLng(38.393339,137.636719), 5);

    GDownloadUrl("https://www.javadrive.jp/google-maps-javascript/data/js/data/highway-list.json", createHighway);
  }
}

function createHighway(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var selectHtml = "";
  selectHtml += "<form>";
  selectHtml += "<select id='rosenname' onChange='dispRosen()'>";

  for (var i = 0; i < json.rosen.length; i++) {
    rosenName.push(json.rosen[i].rname);
    rosenFile.push(json.rosen[i].filename);
    rosenCount.push(json.rosen[i].count);
  }

  for (var i = 0; i < rosenName.length; i++) {
    selectHtml += "<option value='" + rosenFile[i] + "'>"
    selectHtml += rosenName[i];
    selectHtml += "</option>";
  }

  selectHtml += "</select>";
  selectHtml += "</form>";
  document.getElementById("rosen").innerHTML = selectHtml;

  dispRosenLine();
}

function dispRosenLine(){
  for (var i = 1; i < rosenName.length; i++){
    if (rosenCount[i] == 1){
      GDownloadUrl("./data/" + rosenFile[i] + ".json", createLineMap);
    }else{
      for (var no = 1; no <= rosenCount[i]; no++){
        GDownloadUrl("./data/" + rosenFile[i] + no + ".json", createLineMap);
      }
    }
  }
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
  var index = document.getElementById("rosenname").selectedIndex;

  if (index != 0){
    map.clearOverlays();
    dispRosenLine();

    map.setCenter(new GLatLng(38.393339,137.636719), 5);

    if (rosenCount[index] == 1){
      GDownloadUrl("./data/" + rosenFile[index] + ".json", createMap);
    }else{
      for (var no = 1; no <= rosenCount[index]; no++){
        GDownloadUrl("./data/" + rosenFile[index] + no + ".json", createMap);
      }
    }
  }
}

function createMap(jsondata, statusCode){
  var json = eval("(" + jsondata + ")");

  var selectHtml = "";
  selectHtml += "<form>";
  selectHtml += "<select id='ekiname' onChange='selectStation()'>";
  selectHtml += "<option value='0'>選択してください</option>";

  for (var i = 0; i < json.marker.length; i++) {
    var type = json.marker[i].type;
    var pname = json.marker[i].pname;
    var lat = json.marker[i].lat;
    var lng = json.marker[i].lng;

    var marker = createMarker(type, pname, lat, lng);
    map.addOverlay(marker);
    selectHtml += "<option value='" + lat + "," + lng + "'>"
    selectHtml += "[" + type + "]" + pname;
    selectHtml += "</option>";
  }

  selectHtml += "</select>";
  selectHtml += "</form>";

  document.getElementById("ic").innerHTML = selectHtml;
}

function createMarker(type, pname, lat, lng){
  var marker = new GMarker(new GLatLng(lat, lng));

  var html = "<p>" + "[" + type + "]" + pname + "</p>";

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
