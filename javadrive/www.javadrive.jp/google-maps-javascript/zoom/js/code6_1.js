/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(40.526327,140.973816);
  var opts = {
    zoom: 11,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    navigationControlOptions: {
      position: google.maps.ControlPosition.TOP_RIGHT
    }
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  document.getElementById("zoomlevel").innerHTML = "LEVEL:" + map.getZoom();
}
