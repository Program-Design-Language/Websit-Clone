use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @city = ("東京", "大阪");

print "配列に含まれる要素:\n";
for (my $i = 0; $i <= $#city; $i++){
  print "$city[$i]\n";
}

my $val = shift(@city);

print "\n取得した要素:\n";
print "$val\n";

print "残りの要素:\n";
for (my $i = 0; $i <= $#city; $i++){
  print "$city[$i]\n";
}
