/* Google Maps APIサンプル */

var map;
var infowindow;

function initialize() {
  var latlng = new google.maps.LatLng(34.260054,133.082199);
  var opts = {
    zoom: 10,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  var contentStr = 'しまなみ海道の正式名称は西瀬戸自動車道であり' +
    '広島県尾道市から愛媛県今治市に至る道路です';

  infowindow = new google.maps.InfoWindow({
    content: contentStr,
    position: latlng
  });
  infowindow.open(map);
}

function set250() {
  infowindow.close();

  var iwopts = {
    maxWidth: 250
  };
  infowindow.setOptions(iwopts);

  infowindow.open(map);
}

function set300() {
  infowindow.close();

  var iwopts = {
    maxWidth: 300
  };
  infowindow.setOptions(iwopts);

  infowindow.open(map);
}

function set350() {
  var latlng = new google.maps.LatLng(34.064606,132.997742);
  var contentStr = '<p style="width:350px;">' +
    'しまなみ海道の正式名称は西瀬戸自動車道であり' +
    '広島県尾道市から愛媛県今治市に至る道路です' +
    '</p>';

  var infowindow2 = new google.maps.InfoWindow({
    content: contentStr,
    position: latlng
  });
  infowindow2.open(map);
}
