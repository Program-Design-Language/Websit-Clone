use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「P.+P」にマッチするかどうか\n";
print "(マッチする場合は括弧の中にマッチした部分を表示)\n\n";

&check1("aPooPa");
&check1("aPoPoPa");
&check1("aPoo\nPmmmPa");

print "\n「P[\\d\\D]+P」にマッチするかどうか\n";

&check2("aPoo\nPmmmPa");

sub check1{
  my ($str) = @_;

  if ($str =~ /P.+P/){
    print "○:$str ($&)\n";
  }else{
    print "×:$str\n";
  }
}

sub check2{
  my ($str) = @_;

  if ($str =~ /P[\d\D]+P/){
    print "○:$str ($&)\n";
  }else{
    print "×:$str\n";
  }
}
