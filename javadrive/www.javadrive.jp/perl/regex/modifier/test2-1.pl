use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "パターン「/Test/」に対する結果\n\n";

&check1("Test");
&check1("test");
&check1("TEST");

print "\nパターン「/Test/i」に対する結果\n\n";

&check2("Test");
&check2("test");
&check2("TEST");

sub check1{
  my ($str) = @_;

  if ($str =~ /Test/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}

sub check2{
  my ($str) = @_;

  if ($str =~ /Test/i){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
