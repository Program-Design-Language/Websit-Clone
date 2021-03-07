function initMap() {
  var opts = {
    zoom: 17,
    center: new google.maps.LatLng(35.1858948,136.9473611)
  };

  var map = new google.maps.Map(document.getElementById("map"), opts);
}
