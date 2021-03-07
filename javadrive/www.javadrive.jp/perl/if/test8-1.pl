use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $count;

$count = 5;
print "$count\n";

$count = $count - 10 if $count > 0;
print "$count\n";

$count = $count - 10 if $count > 0;
print "$count\n";
