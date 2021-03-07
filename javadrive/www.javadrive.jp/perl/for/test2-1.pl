use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $count;

$count = 0;
until ($count >= 2){
  print "count = $count \n";
  $count ++;
}

print "以上です";
