use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "Hello";

if ($str eq "Hello"){
  print "文字列はHelloです\n";
}else{
  print "文字列はHelloではありません\n";
}

if ($str eq "e"){
  print "文字列に「e」を含みます\n";
}else{
  print "文字列は「e」を含みません\n";
}

if ($str =~ /e/){
  print "文字列に「e」を含みます\n";
}else{
  print "文字列は「e」を含みません\n";
}
