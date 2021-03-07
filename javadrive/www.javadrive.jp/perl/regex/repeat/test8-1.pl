use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「P.+P」にマッチするかどうか\n";

&check1("aP12Pa");
&check1("aP12P34Pa");
&check1("aP12P34P56Pa");

print "\n「P.+?P」にマッチするかどうか\n";

&check2("aP12Pa");
&check2("aP12P34Pa");
&check2("aP12P34P56Pa");

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

  if ($str =~ /P.+?P/){
    print "○:$str ($&)\n";
  }else{
    print "×:$str\n";
  }
}
