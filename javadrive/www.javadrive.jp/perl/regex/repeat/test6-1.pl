use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「G(oog)+le」にマッチするかどうか\n\n";

&check("Gle");
&check("Goole");
&check("Google");
&check("Googoogle");
&check("Googoogoogle");
&check("Googole");
&check("Googgle");
&check("Googogole");

sub check{
  my ($str) = @_;

  if ($str =~ /G(oog)+le/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
