use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「200[.*+?[(){}|\\]\\\\]」にマッチするかどうか\n\n";

&check("200.");
&check("200*");
&check("200+");
&check("200?");
&check("200[");
&check("200{");
&check("200}");
&check("200(");
&check("200)");
&check("200|");
&check("200]");
&check("200\\");

sub check{
  my ($str) = @_;

  if ($str =~ /200[.*+?[(){}|\]\\]/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
