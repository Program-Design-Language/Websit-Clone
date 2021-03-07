/* jQueryサンプル */

$(function() {
  $("#redBtn").click(function() {
    var prop = {
      "background-color":"#ff0000",
      "color":"#ffffff",
      "border":"2px solid #800000"
    }

    $("p").css(prop);
  });

  $("#blueBtn").click(function() {
    var prop = {
      backgroundColor:"#0000ff",
      color:"#ffffff",
      border:"2px solid #000080"
    }

    $("p").css(prop);
  });
});
