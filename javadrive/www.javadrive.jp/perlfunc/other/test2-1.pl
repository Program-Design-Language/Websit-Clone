use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $var;
&check($var);

$var = "Test";
&check($var);

undef($var);
&check($var);

sub check{
  if (defined($_[0])){
    print "定義済み\n";
  }else{
    print "未定義値\n";
  }
}
