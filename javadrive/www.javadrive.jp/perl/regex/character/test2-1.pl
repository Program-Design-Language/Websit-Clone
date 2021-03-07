use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「200[0-9xX]」にマッチするかどうか\n\n";

&check("200");
&check("2001");
&check("2005");
&check("2010");
&check("200x");
&check("200X");
&check("200z");

sub check{
  my ($str) = @_;

  if ($str =~ /200[0-9xX]/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
