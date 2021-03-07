use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「no(0|1|2)+ is」にマッチするかどうか\n\n";

&check("no0 is xxx");
&check("no2 is yyy");
&check("no11 is zzz");
&check("no021 is xxx");
&check("no03 is yyy");
&check("nois zzz");

sub check{
  my ($str) = @_;

  if ($str =~ /no(0|1|2)+ is/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
