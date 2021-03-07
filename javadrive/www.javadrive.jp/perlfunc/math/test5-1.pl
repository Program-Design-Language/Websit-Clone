use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = log(2);
print "log(2) = $num\n";

$num = log(8) / log(2);
print "log2(8) = $num\n";
