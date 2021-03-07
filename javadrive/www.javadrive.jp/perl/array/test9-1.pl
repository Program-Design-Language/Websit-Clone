use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @str = ("1月", "2月", "6月");

$str[$#str] = "3月";
for (my $i = 0; $i <= $#str; $i++){
  print "$str[$i]\n";
}

$#str = 1;
for (my $i = 0; $i <= $#str; $i++){
  print "$str[$i]\n";
}
