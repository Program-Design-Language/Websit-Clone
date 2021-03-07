use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @name = qw/ 伊藤 工藤 山田 /;

for (my $i = 0; $i < 3; $i++){
  print "$name[$i]\n";
}
