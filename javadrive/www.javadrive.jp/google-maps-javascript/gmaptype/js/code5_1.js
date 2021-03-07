/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(33.667497,135.372505);
  var opts = {
    zoom: 13,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    mapTypeControlOptions: {
      position: google.maps.ControlPosition.TOP_LEFT
    },
    navigationControlOptions: {
      position: google.maps.ControlPosition.TOP_RIGHT
    }
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}
