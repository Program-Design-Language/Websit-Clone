use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @num = (10..14, 20);
my $count = @num;

for (my $i = 0; $i < $count; $i++){
  print "$num[$i]\n";
}
