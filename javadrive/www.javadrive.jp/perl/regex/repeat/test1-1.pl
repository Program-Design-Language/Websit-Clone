use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「ab.cd」にマッチするかどうか\n\n";

&check("ab6cd");
&check("abycd");
&check("ab\tcd");
&check("ab\ncd");
&check("abcd");
&check("abpocd");

sub check{
  my ($str) = @_;

  if ($str =~ /ab.cd/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
