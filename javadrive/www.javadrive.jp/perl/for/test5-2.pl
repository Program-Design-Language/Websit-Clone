use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @fruit = ("りんご", "メロン", "イチゴ");

for my $name (@fruit){
  print "$name\n";
}
