/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(43.070667,141.343585);
  var opts = {
    zoom: 14,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  var contentStr = '<p>' +
    '<img src="img/home.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ginfowindow/js/img/home.png*/ width="24" height="24" alt="home" />' + 
    '<a href="http://www.hokudai.ac.jp/">北海道大学</a>' +
    '</p>';

  var infowindow = new google.maps.InfoWindow({
    content: contentStr,
    position: latlng
  });
  infowindow.open(map);
}
