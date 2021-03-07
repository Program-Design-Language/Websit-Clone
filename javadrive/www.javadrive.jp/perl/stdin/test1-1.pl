use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($kokugo, $sansuu);

if (@ARGV == 2){
  my $kokugo = $ARGV[0];
  my $sansuu = $ARGV[1];

  print "国語=$kokugo, 算数=$sansuu\n";
  if ($kokugo > 75 && $sansuu > 75){
    print "合格です\n";
  }else{
    print "不合格です\n";
  }
}else{
  print "引数を2つ指定して下さい\n";
}
