function initMap() {
  var opts = {
    zoom: 10,
    center: new google.maps.LatLng(31.591404,130.654907),
    mapTypeControl: false
  };

  var map = new google.maps.Map(document.getElementById("map"), opts);
}
