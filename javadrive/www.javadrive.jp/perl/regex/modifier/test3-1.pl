use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "パターン「/((\d+)(yen))/」に対する結果\n\n";

&check("2000yen");
&check("380yen");
&check("920en");

sub check{
  my ($str) = @_;

  if ($str =~ 
    /(
       (
         \d   #任意の数字
         +    #1回以上繰り返し
       )
       (
         yen  #yenで終わる
       )
     )
    /x){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
