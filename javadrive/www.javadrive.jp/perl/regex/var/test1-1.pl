use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

&check1("and", "copy and paste");
&check2("(J|j)ava", "disable JavaScript");
&check2("(J|j)ava", "disable javaScript");
&check2("(J|j)ava", "disable javascript");

sub check1{
  my ($pattern, $str) = @_;

  if ($str =~ /$pattern/){
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}

sub check2{
  my ($pattern, $str) = @_;

  if ($str =~ /${pattern}Script/){
    print "対象文字列: $str\nマッチ部分: $&\n\n";
  }
}
