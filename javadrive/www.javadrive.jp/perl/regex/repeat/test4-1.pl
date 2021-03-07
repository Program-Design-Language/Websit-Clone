use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「Go?gle」にマッチするかどうか\n\n";

&check("Ggle");
&check("Gogle");
&check("Google");
&check("Gooooogle");
&check("Gmgle");
&check("Gomgle");

sub check{
  my ($str) = @_;

  if ($str =~ /Go?gle/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
