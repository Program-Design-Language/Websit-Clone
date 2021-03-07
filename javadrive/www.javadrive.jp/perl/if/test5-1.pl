use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = 12;

print "数値 = $num\n";
if ($num >= 20){
  print "20以上です\n";
}elsif ($num >= 10){
  print "10以上20未満です\n";
}else{
  print "10以下です\n";
}

