function initMap() {
  var opts1 = {
    zoom: 15,
    center: new google.maps.LatLng(35.6328964,139.8782003)
  };

  var opts2 = {
    zoom: 15,
    center: new google.maps.LatLng(34.6659803,135.4315818)
  };

  var map1 = new google.maps.Map(document.getElementById("map1"), opts1);

  var map2 = new google.maps.Map(document.getElementById("map2"));
  map2.setOptions(opts2);
}
