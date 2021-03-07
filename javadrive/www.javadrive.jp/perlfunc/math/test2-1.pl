use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = abs(-18);
print "abs(-18) = $num\n";

$num = abs(18);
print "abs(18) = $num\n";

$num = abs(-3.567);
print "abs(-3.567) = $num\n";
