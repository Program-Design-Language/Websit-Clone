use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "「_\\w+_」にマッチするかどうか\n\n";

&check("_end_");
&check("_op2000_");
&check("_NO011nen_");
&check("_and");
&check("print_");
&check("_graph#you_");
&check("_color red_");

sub check{
  my ($str) = @_;

  if ($str =~ /_\w+_/){
    print "○:$str\n";
  }else{
    print "×:$str\n";
  }
}
