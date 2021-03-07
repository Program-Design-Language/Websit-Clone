use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @month = ("月曜", "火曜", "水曜");

print "配列に含まれる要素:\n";
for (my $i = 0; $i <= $#month; $i++){
  print "$month[$i]\n";
}

my $val = pop(@month);

print "\n取得した要素:\n";
print "$val\n";

print "残りの要素:\n";
for (my $i = 0; $i <= $#month; $i++){
  print "$month[$i]\n";
}
