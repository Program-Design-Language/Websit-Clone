use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

for (my $chrno = 72; $chrno < 78; $chrno++){
  my $charstr = chr($chrno);
  print "$chrno = $charstr\n";
}
