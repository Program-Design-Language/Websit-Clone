use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @city = ("東京", "大阪", "名古屋");
foreach my $var(@city){
  print "$var\n";
}

print "\n逆に並べ替えます\n\n";

my @rcity = reverse(@city);
foreach my $var(@rcity){
  print "$var\n";
}
