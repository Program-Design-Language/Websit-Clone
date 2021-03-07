use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "パターン: /((\\d+)(yen))/\n\n";

&check("book is 2000yen, cake is 800yen");
&check("orange is 950yen");

sub check{
  my ($str) = @_;

  if ($str =~ /((\d+)(yen))/){
    print "対象: $str\n";
    print "\$1: $1\n";
    print "\$2: $2\n";
    print "\$3: $3\n\n";
  }
}
