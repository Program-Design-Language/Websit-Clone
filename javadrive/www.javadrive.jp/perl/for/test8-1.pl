use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $count = 0;

while ($count <= 5){
  $count++;

  if ($count == 2){
    next;
  }

  print "$count\n";
  
  #next演算子が実行されるとこの位置に進む
}
print "終了\n";
