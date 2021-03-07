/* Google Maps APIサンプル */

var map;
var flag;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(36.870832,139.130859), 1);

    flag = false;
    dispPolyline();
  }
}

function change() {
  map.clearOverlays();

  if (flag == true){
    flag = false;
  }else{
    flag = true;
  }

  dispPolyline();
}

function dispPolyline(){
  var points1 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(34.020795,-118.234863)
  ];

  var points2 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(38.83115,-77.036133)
  ];

  var points3 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(53.45862,-2.219238)
  ];

  var points4 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(28.516969,77.211914)
  ];

  var points5 = [
    new GLatLng(35.687418,139.707642),
    new GLatLng(55.751656,37.621307)
  ];

  var opts = {geodesic:flag};

  var line1 = new GPolyline(points1, "#ff0000", 3, 0.6, opts);
  var line2 = new GPolyline(points2, "#0000ff", 3, 0.6, opts);
  var line3 = new GPolyline(points3, "#00ff00", 3, 0.6, opts);
  var line4 = new GPolyline(points4, "#ff00ff", 3, 0.6, opts);
  var line5 = new GPolyline(points5, "#00ffff", 3, 0.6, opts);

  map.addOverlay(line1);
  map.addOverlay(line2);
  map.addOverlay(line3);
  map.addOverlay(line4);
  map.addOverlay(line5);
}
