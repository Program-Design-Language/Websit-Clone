/* jQueryサンプル */

$(function() {
  $("#solidBtn").click(function() {
    $("p").css("border", "3px solid #ff0000"); 
  });

  $("#dottedBtn").click(function() {
    $("p").css("border", "3px dotted #ff0000"); 
  });

});
