/* Google Maps APIサンプル */

function initialize() {
  var latlng = new google.maps.LatLng(38.024295,138.390656);
  var opts = {
    zoom: 10,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("map_canvas"), opts);

  google.maps.event.addListener(map, 'maptypeid_changed', function() {
    var maptypeid = map.getMapTypeId();
    var str = "マップタイプ：";

    if (maptypeid == google.maps.MapTypeId.HYBRID){
      str += "ハイブリット";
    }else if (maptypeid == google.maps.MapTypeId.ROADMAP){
      str += "地図";
    }else if (maptypeid == google.maps.MapTypeId.SATELLITE){
      str += "衛星写真";
    }else if (maptypeid == google.maps.MapTypeId.TERRAIN){
      str += "地形";
    }

    document.getElementById("maptype").innerHTML = str;
  });
}
