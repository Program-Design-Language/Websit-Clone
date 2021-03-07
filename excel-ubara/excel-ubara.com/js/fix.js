$(document).ready(function(){
  if ($(window).width() >= 800) {
    var $window = $(window);
    var $container = $('#contents');
    var $main = $('#main');
    var $sidebar = $('#sub');
    var windowHeight, containerHeight, sidebarHeight;
    $window.on('resize', init);
    init();
    // �������̍X�V�A�C�x���g�n���h���̓o�^�E�����Ȃ�
    function init() {
      var mainHeight = $main.outerHeight(true);
      windowHeight = $window.height();
      containerHeight = $container.outerHeight(true);
      sidebarHeight = $sidebar.outerHeight(true);
      $window.off('scroll', adjustSidebar); // �X�N���[���n���h������U����

      if ((mainHeight > sidebarHeight) && (sidebarHeight > windowHeight)) {
        $window.on('scroll', adjustSidebar);  // ���I�ȃT�C�h�o�[����
        adjustSidebar();  // �����Ɉ�x�ʒu����
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
    // �T�C�h�o�[�̈ʒu�𒲐����鏈��
    function adjustSidebar() {
      var windowTop = window.pageYOffset;
      var windowBottom = windowTop + windowHeight;
      var containerTop = $container.offset().top;
      var containerBottom = containerTop + containerHeight;
      var sidebarTop = $sidebar.offset().top;
      var sidebarBottom = sidebarTop + sidebarHeight;

      if (windowTop < containerTop) { // ��ւ̍s���߂��h�~
        posAbsolute(0);
      } else if (windowBottom > containerBottom) { // ���ւ̍s���߂��h�~
        posAbsolute(containerHeight - sidebarHeight);
      } else if (windowTop < sidebarTop) { // ��X�N���[�����̏�[�Œ�
        posAbsolute(windowTop - containerTop);
      } else if (windowBottom > sidebarBottom) { // ���X�N���[�����̉��[�Œ�
        posAbsolute(windowBottom - containerTop - sidebarHeight);
      }
      // ����ȊO�͉��������A���R�ɃX�N���[������̂ɂ܂�����
    }
  }
});