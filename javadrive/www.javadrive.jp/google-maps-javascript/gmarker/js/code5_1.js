/* Google Maps APIサンプル */

function initialize() {
  if (GBrowserIsCompatible()) {
    var map = new GMap2(document.getElementById("map_canvas"));
    map.setCenter(new GLatLng(41.7724,140.72628), 12);

    var opts1 = {draggable:true};
    var opts2 = {draggable:true, autoPan:false};
    var opts3 = {draggable:true, bouncy:false};

    var marker1 = new GMarker(new GLatLng(41.75886,140.703535), opts1);
    var marker2 = new GMarker(new GLatLng(41.79672,140.757179), opts2);
    var marker3 = new GMarker(new GLatLng(41.772644,140.725315), opts3);

    map.addOverlay(marker1);
    map.addOverlay(marker2);
    map.addOverlay(marker3);
  }
}
