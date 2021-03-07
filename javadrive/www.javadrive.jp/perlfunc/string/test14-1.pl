use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "Calendar";
for (my $i = 0; $i < length($str); $i++){
  # 1文字ずつ取り出す
  my $onestr = substr($str, $i, 1);

  my $charno = ord($onestr);
  print "$onestr = $charno\n";
}
