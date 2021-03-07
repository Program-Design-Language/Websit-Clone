/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(43.582878,144.527893);
  var opts = {
    zoom: 11,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };

  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);
  dispLevel(map.getZoom());

  google.maps.event.addListener(map, 'zoom_changed', function() {
    dispLevel(map.getZoom());
  });
}

function dispLevel(level) {
  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + level;
}
