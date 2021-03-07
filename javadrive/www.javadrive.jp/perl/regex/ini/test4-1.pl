use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "abcdedcba";

print "対象:$str\n";

if ($str =~ m@cde@){
  print "cdeにマッチします\n";
}else{
  print "cdeにマッチしません\n";
}

$str = "ab/ddef/edf/abc";

print "対象:$str\n";

if ($str =~ m(ef/e)){
  print "ef/eにマッチします\n";
}else{
  print "ef/eにマッチしません\n";
}
