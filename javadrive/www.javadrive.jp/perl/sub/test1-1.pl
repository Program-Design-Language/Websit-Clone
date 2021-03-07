use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @city = ("東京", "大阪", "名古屋");
&dispArrayValue(@city);

my @rcity = reverse(@city);
&dispArrayValue(@rcity);

sub dispArrayValue{
  my @array = @_;

  print "配列の要素を出力します\n";
  foreach my $var(@array){
    print "$var\n";
  }
}
