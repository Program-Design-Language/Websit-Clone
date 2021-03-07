use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "abcdedcba";

print "対象:$str\n";

if ($str =~ /cda/){
  print "cdaにマッチします\n";
}else{
  print "cdaにマッチしません\n";
}

if ($str =~ /cde/){
  print "cdeにマッチします\n";
}else{
  print "cdeにマッチしません\n";
}
