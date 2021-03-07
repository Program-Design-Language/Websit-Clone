use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "[the]";

print "対象:$str\n";

if ($str =~ /\[t/){
  print "[t にマッチします\n";
}else{
  print "[t にマッチしません\n";
}

$str = "ab\tcd";

print "対象:$str\n";

if ($str =~ /b\tc/){
  print "b\tc にマッチします\n";
}else{
  print "b\tc にマッチしません\n";
}
