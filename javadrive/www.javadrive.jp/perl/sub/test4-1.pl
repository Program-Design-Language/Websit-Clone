use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

&calcAverage(10, 8);
&calcAverage(5, 17);

sub calcAverage{
  my $ave;
  $ave = ($_[0] + $_[1]) / 2;
  print "$_[0] と $_[1] の平均値は $ave です\n";
}
