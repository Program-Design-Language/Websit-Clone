use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「199[6789]」にマッチするかどうか\n\n";

&check("199");
&check("1995");
&check("1996");
&check("1997");
&check("1998");
&check("1999");
&check("2000");

sub check{
  my ($str) = @_;

  if ($str =~ /199[6789]/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
