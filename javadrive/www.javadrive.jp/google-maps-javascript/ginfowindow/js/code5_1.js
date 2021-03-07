/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(35.693317,139.74972);
  var opts = {
    zoom: 16,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  var contentStr = '日本武道館';

  var infowindow = new google.maps.InfoWindow({
    content: contentStr,
    position: latlng,
    pixelOffset: new google.maps.Size(10, -6)
  });
  infowindow.open(map);
}
