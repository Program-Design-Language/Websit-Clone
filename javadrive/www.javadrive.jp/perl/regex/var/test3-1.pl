use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

$" = "|";
&check1('hogehoge@color');
&check2('hogehoge@color');

&check1("border white");
&check2("border white");

sub check1{
  my ($str) = @_;

  if ($str =~ m'(@color)'){
    print "パターン: m'(\@color)'\n";
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}

sub check2{
  my ($str) = @_;
  my @color = ("black", "red", "white");

  if ($str =~ m/(@color)/){
    print "パターン: m/(\@color)/\n";
    print "配列\@color: @color\n";
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}
