/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.659683,139.742956), 16);

    var street = new GStreetviewOverlay();
    map.addOverlay(street);

    var slatlng = new GLatLng(35.659683,139.742956);
    var povopts1 = { yaw:90, pitch:5 };
    var povopts2 = { yaw:270, pitch:-5 };

    var option1 = { latlng:slatlng, pov:povopts1 };
    var option2 = { latlng:slatlng, pov:povopts2 };

    var scontainer1 = document.getElementById("street1");
    var panorama1 = new GStreetviewPanorama(scontainer1, option1);

    var scontainer2 = document.getElementById("street2");
    var panorama2 = new GStreetviewPanorama(scontainer2, option2);
  }
}
