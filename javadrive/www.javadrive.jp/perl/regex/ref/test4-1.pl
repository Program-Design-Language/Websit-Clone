use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "パターン: /(\\d+)yen/\n";
&check1("book is 2391yen, cake is 800yen");

print "\n";

print "パターン: /(\\d)+yen/\n";
&check2("book is 2391yen, cake is 800yen");

sub check1{
  my ($str) = @_;

  if ($str =~ /(\d+)yen/){
    print "対象: $str\n";
    print "\$1: $1\n";
  }
}

sub check2{
  my ($str) = @_;

  if ($str =~ /(\d)+yen/){
    print "対象: $str\n";
    print "\$1: $1\n";
  }
}
