use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @city = ("東京", "大阪");

unshift(@city, "名古屋");

for (my $i = 0; $i <= $#city; $i++){
  print "$city[$i]\n";
}

print "\n";

unshift(@city, ("札幌", "福岡"));

for (my $i = 0; $i <= $#city; $i++){
  print "$city[$i]\n";
}
