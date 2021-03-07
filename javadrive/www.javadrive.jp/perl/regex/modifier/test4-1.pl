use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "パターン「--.+--/」に対する結果\n";
&check1("ab -- log dot -- jp\n stone -- wat");

print "\nパターン「--.+--/s」に対する結果\n";
&check2("ab -- log dot -- jp\n stone -- wat");

sub check1{
  my ($str) = @_;

  if ($str =~ /--.+--/){
    print "○:$str\n";
    print "マッチする箇所:$&\n";
  }else{
    print "×:$str\n";
  }
}

sub check2{
  my ($str) = @_;

  if ($str =~ /--.+--/s){
    print "○:$str\n";
    print "マッチする箇所:$&\n";
  }else{
    print "×:$str\n";
  }
}
