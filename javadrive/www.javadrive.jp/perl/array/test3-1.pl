use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @seiseki;
$seiseki[0] = 80;
$seiseki[1] = 75;
$seiseki[2] = 69;

for (my $i = 0; $i < 3; $i++){
  print "$seiseki[$i]\n";
}
