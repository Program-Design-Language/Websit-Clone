var map;

function initMap() {
  var opts = {
    zoom: 15,
    center: new google.maps.LatLng(35.012863,135.677762),
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };

  map = new google.maps.Map(document.getElementById("map"), opts);
}

function changeMapType(type) {
  map.setMapTypeId(type);
}
