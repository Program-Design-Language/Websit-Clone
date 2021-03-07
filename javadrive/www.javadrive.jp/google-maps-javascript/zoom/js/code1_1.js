/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(34.454129,136.725798);
  var opts = {
    zoom: 12,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP,
    navigationControl: false
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);
}
