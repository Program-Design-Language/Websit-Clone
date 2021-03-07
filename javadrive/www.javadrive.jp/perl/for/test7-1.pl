use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $count = 1;

while (1){
  print "$count\n";
  $count++;

  if ($count > 5){
    last;
  }
}
print "終了\n";
