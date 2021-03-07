/* Google Maps APIサンプル */

var map;
var line;
var flag;

function initialize() {
  if (GBrowserIsCompatible()) {
    map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(41.7724,140.72628), 12);

    var point1 = new GLatLng(41.75886,140.703535);
    var point2 = new GLatLng(41.79672,140.757179);

    var marker1 = new GMarker(point1);
    var marker2 = new GMarker(point2);
    line = new GPolyline([point1, point2]);
    flag = true;

    map.addOverlay(marker1);
    map.addOverlay(marker2);
    map.addOverlay(line);
  }
}

function removeLine(){
  if (flag == true){
    map.removeOverlay(line);
    document.getElementById("rmline").value = "ラインを追加";
    flag = false;
  }else{
    map.addOverlay(line);
    document.getElementById("rmline").value = "ラインを削除";
    flag = true;
  }
}
