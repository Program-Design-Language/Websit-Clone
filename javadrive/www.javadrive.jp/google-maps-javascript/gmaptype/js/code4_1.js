/* Google Maps APIサンプル */

var map1, map2;

function initialize() {
  var latlng1 = new google.maps.LatLng(43.768615,142.482462);
  var latlng2 = new google.maps.LatLng(43.768615,142.482462);

  var opts1 = {
    zoom: 14,
    center: latlng1,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };

  var opts2 = {
    zoom: 14,
    center: latlng2,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };

  map1 = new google.maps.Map(document.getElementById("map_canvas1"), opts1);
  map2 = new google.maps.Map(document.getElementById("map_canvas2"), opts2);
}

function setDefault() {
  var opts1 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.DEFAULT
    }
  };

  var opts2 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.DEFAULT
    }
  };

  map1.setOptions(opts1);
  map2.setOptions(opts2);
}

function setDropdown() {
  var opts1 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.DROPDOWN_MENU
    }
  };

  var opts2 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.DROPDOWN_MENU
    }
  };

  map1.setOptions(opts1);
  map2.setOptions(opts2);
}

function setHorizon() {
  var opts1 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.HORIZONTAL_BAR
    }
  };

  var opts2 = {
    mapTypeControlOptions: {
      style: google.maps.MapTypeControlStyle.HORIZONTAL_BAR
    }
  };

  map1.setOptions(opts1);
  map2.setOptions(opts2);
}
