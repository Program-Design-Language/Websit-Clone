use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

&personal("加藤", 25, "東京都");

sub personal{
  my ($name, $old, $address) = @_;

  print "名前は $name です\n";
  print "年齢は $old です\n";
  print "住所は $address です\n";
}
