use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = rand(10);
print "$num\n";
$num = int(rand(10));
print "$num\n";
