use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @month = ("月曜", "火曜", "水曜");
push(@month, "木曜");

for (my $i = 0; $i <= $#month; $i++){
  print "$month[$i]\n";
}

print "\n";

push(@month, ("金曜", "土曜", "日曜"));

for (my $i = 0; $i <= $#month; $i++){
  print "$month[$i]\n";
}
