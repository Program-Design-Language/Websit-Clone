function initMap() {
  var opts = {
    zoom: 10,
    center: new google.maps.LatLng(31.591404,130.654907),
    mapTypeControlOptions: {
      mapTypeIds: [
        google.maps.MapTypeId.ROADMAP,
        google.maps.MapTypeId.TERRAIN
      ]
    }
  };

  var map = new google.maps.Map(document.getElementById("map"), opts);
}
