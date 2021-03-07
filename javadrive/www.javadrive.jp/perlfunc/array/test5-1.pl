use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @city = ("東京", "大阪", "名古屋");

my $val = delete($city[2]);
print "削除された値:$val\n\n";

print "残っている要素\n";
foreach my $i(0 .. $#city){
  print "$city[$i]\n";
}
