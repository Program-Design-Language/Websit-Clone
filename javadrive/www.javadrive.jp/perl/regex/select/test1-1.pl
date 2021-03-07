use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「Today is (Friday|Saturday|Sunday)」にマッチするかどうか\n\n";

&check("Today is Friday");
&check("Today is Sunday");
&check("Today is Thursday");
&check("Tomorrow is Sunday");
&check("Saturday");

sub check{
  my ($str) = @_;

  if ($str =~ /Today is (Friday|Saturday|Sunday)/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
