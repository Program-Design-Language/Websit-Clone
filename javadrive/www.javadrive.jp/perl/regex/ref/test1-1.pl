use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

&check("book is 2000yen, cake is 800yen");
&check("orange is 950yen");

sub check{
  my ($str) = @_;

  if ($str =~ /\d+yen/){
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}
