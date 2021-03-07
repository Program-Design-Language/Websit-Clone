use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

$" = "|";
&check("background red");
&check("foreground yellow");
&check("border white");

sub check{
  my ($str) = @_;
  my @color = ("black", "red", "white");

  if ($str =~ /(@color)/){
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}
