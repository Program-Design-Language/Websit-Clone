var map;

function initMap() {
  var opts = {
    zoom: 15,
    center: new google.maps.LatLng(35.185384,136.89909)
  };

  map = new google.maps.Map(document.getElementById("map"), opts);

  map.addListener('drag', dispLatLng);
}

function dispLatLng(){
  var latlng = map.getCenter();
  var str = "中心：" + latlng.lat() + "," + latlng.lng() + "<br>";

  var latlngBounds = map.getBounds();
  var swLatlng = latlngBounds.getSouthWest();
  str = str + "左下：" + swLatlng.lat() + "," + swLatlng.lng() + "<br>";

  var neLatlng = latlngBounds.getNorthEast();
  str = str + "右上：" + neLatlng.lat() + "," + neLatlng.lng();

  document.getElementById("latlng").innerHTML = str;
}
