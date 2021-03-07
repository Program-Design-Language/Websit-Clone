/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(35.158653,136.90012);
  var opts = {
    zoom: 13,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  var iw_latlng1 = new google.maps.LatLng(35.142792,136.900635);
  var infowindow1 = new google.maps.InfoWindow({
    content: '金山',
    position: iw_latlng1,
    zIndex: 1
  });

  infowindow1.open(map);

  var iw_latlng2 = new google.maps.LatLng(35.15739,136.915913);
  var infowindow2 = new google.maps.InfoWindow({
    content: '鶴舞',
    position: iw_latlng2,
    zIndex: 2
  });

  infowindow2.open(map);

  var iw_latlng3 = new google.maps.LatLng(35.152267,136.888018);
  var infowindow3 = new google.maps.InfoWindow({
    content: '山王',
    position: iw_latlng3,
    zIndex: 3
  });

  infowindow3.open(map);
}
