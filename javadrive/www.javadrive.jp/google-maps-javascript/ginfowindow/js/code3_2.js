/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(35.156214,136.965222);
  var opts = {
    zoom: 14,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  var p_node = document.createElement("p");

  var img_node = document.createElement("img");
  img_node.src = "img/home.png"/*tpa=https://www.javadrive.jp/google-maps-javascript/ginfowindow/js/img/home.png*/;
  img_node.width = "24";
  img_node.height = "24";
  img_node.alt = "home";

  var a_node = document.createElement("a");
  a_node.href = "http://www.nagoya-u.ac.jp/";

  var text_node = document.createTextNode("名古屋大学");
  a_node.appendChild(text_node);

  p_node.appendChild(img_node);
  p_node.appendChild(a_node);

  var infowindow = new google.maps.InfoWindow({
    content: p_node,
    position: latlng
  });
  infowindow.open(map);
}
