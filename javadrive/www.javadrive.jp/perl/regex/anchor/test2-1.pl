use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "homepage";
print "対象:$str\n";

if ($str =~ /home$/){
  print "文字列の最後に「home」を含みます\n";
}else{
  print "文字列の最後に「home」を含みません\n";
}

$str = "my home";
print "対象:$str\n";

if ($str =~ /home$/){
  print "文字列のhomeに「home」を含みます\n";
}else{
  print "文字列のhomeに「home」を含みません\n";
}
