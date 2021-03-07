/* jQueryサンプル */

$(function() {
  $("div").click(function() {
    var bgcolor = $(this).css("background-color"); 
    alert(bgcolor);
  });
});
