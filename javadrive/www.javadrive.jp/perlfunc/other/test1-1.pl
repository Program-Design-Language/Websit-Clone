use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $var;

if (defined($var)){
  print "定義済み\n";
}else{
  print "未定義値\n";
}

$var = "Test";

if (defined($var)){
  print "定義済み\n";
}else{
  print "未定義値\n";
}

$var = "";

if (defined($var)){
  print "定義済み\n";
}else{
  print "未定義値\n";
}
