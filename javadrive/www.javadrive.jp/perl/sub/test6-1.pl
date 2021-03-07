use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($sum, $str);

$sum = &calcTwoNum(10, 23);
print "$sum\n";

$sum = &calcTwoNum(32, 14);
print "$sum\n";

sub calcTwoNum{
  my ($num1, $num2) = @_;

  $num1 + $num2;
}
