$(document).ready(function(){
  if ($(window).width() >= 800) {
    var $window = $(window);
    var $container = $('#contents');
    var $main = $('#main');
    var $sidebar = $('#sub');
    var windowHeight, containerHeight, sidebarHeight;
    $window.on('resize', init);
    init();
    // 高さ情報の更新、イベントハンドラの登録・解除など
    function init() {
      var mainHeight = $main.outerHeight(true);
      windowHeight = $window.height();
      containerHeight = $container.outerHeight(true);
      sidebarHeight = $sidebar.outerHeight(true);
      $window.off('scroll', adjustSidebar); // スクロールハンドラを一旦解除

      if ((mainHeight > sidebarHeight) && (sidebarHeight > windowHeight)) {
        $window.on('scroll', adjustSidebar);  // 動的なサイドバー制御
        adjustSidebar();  // すぐに一度位置調整
      } else {
        posSticky();
      }
    }
    function posSticky() {
      $sidebar.css({ 'position' : 'sticky', 'top' : 0 });
    }
    function posAbsolute(offset) {
      $sidebar.css({ 'position' : 'absolute', 'top' : offset });
    }
    // サイドバーの位置を調整する処理
    function adjustSidebar() {
      var windowTop = window.pageYOffset;
      var windowBottom = windowTop + windowHeight;
      var containerTop = $container.offset().top;
      var containerBottom = containerTop + containerHeight;
      var sidebarTop = $sidebar.offset().top;
      var sidebarBottom = sidebarTop + sidebarHeight;

      if (windowTop < containerTop) { // 上への行き過ぎ防止
        posAbsolute(0);
      } else if (windowBottom > containerBottom) { // 下への行き過ぎ防止
        posAbsolute(containerHeight - sidebarHeight);
      } else if (windowTop < sidebarTop) { // 上スクロール時の上端固定
        posAbsolute(windowTop - containerTop);
      } else if (windowBottom > sidebarBottom) { // 下スクロール時の下端固定
        posAbsolute(windowBottom - containerTop - sidebarHeight);
      }
      // それ以外は何もせず、自然にスクロールするのにまかせる
    }
  }
});