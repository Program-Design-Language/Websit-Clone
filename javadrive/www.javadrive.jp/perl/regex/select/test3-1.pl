use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「(add_.+_|delete_.+_)」にマッチするかどうか\n\n";

&check("add_panel_");
&check("delete_screen_margin_");
&check("add_control");
&check("delete__");

sub check{
  my ($str) = @_;

  if ($str =~ /(add_.+_|delete_.+_)/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
