use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $old;

$old = 18;

if ($old >= 20){
  print "ご利用頂けます\n";
}else{
  print "未成年の方はご利用頂けません\n";
}

$old = 34;

if ($old >= 20){
  print "ご利用頂けます\n";
}else{
  print "未成年の方はご利用頂けません\n";
}
