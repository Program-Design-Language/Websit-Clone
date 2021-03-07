function initMap() {
  var opts = {
    zoom: 15,
    center: new google.maps.LatLng(34.687146,135.52597)
  };
  var map = new google.maps.Map(document.getElementById("map"), opts);
}
