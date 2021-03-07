use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @name = ("伊藤", "工藤", "山田");
$name[3] = "高橋";
$name[1] = "安藤";

for (my $i = 0; $i < 4; $i++){
  print "$name[$i]\n";
}
