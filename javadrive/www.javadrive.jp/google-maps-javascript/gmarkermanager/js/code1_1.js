/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(35.172999,136.897057), 12);

    var manager = new GMarkerManager(map);

    var marker1_1 = new GMarker(new GLatLng(35.176468,136.896866));
    var marker1_2 = new GMarker(new GLatLng(35.174153,136.8970979));
    var marker1_3 = new GMarker(new GLatLng(35.173234,136.89762));
    var marker1_4 = new GMarker(new GLatLng(35.173383,136.89987));
    var marker1_5 = new GMarker(new GLatLng(35.172986,136.899894));
    var marker1_6 = new GMarker(new GLatLng(35.172848,136.897845));
    var marker1_7 = new GMarker(new GLatLng(35.174106,136.896676));
    var marker1_8 = new GMarker(new GLatLng(35.175878,136.896483));

    var marker2_1 = new GMarker(new GLatLng(35.17613,136.89667));
    var marker2_2 = new GMarker(new GLatLng(35.174131,136.896885));
    var marker2_3 = new GMarker(new GLatLng(35.173034,136.897818));
    var marker2_4 = new GMarker(new GLatLng(35.173192,136.899881));

    var marker3_1 = new GMarker(new GLatLng(35.172999,136.897057));

    manager.addMarker(marker1_1, 16);
    manager.addMarker(marker1_2, 16);
    manager.addMarker(marker1_3, 16);
    manager.addMarker(marker1_4, 16);
    manager.addMarker(marker1_5, 16);
    manager.addMarker(marker1_6, 16);
    manager.addMarker(marker1_7, 16);
    manager.addMarker(marker1_8, 16);

    manager.addMarker(marker2_1, 14, 15);
    manager.addMarker(marker2_2, 14, 15);
    manager.addMarker(marker2_3, 14, 15);
    manager.addMarker(marker2_4, 14, 15);

    manager.addMarker(marker3_1, 0, 13);
  }
}
