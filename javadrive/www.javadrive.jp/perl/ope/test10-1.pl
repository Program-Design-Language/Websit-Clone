use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $var;

$var = 10 * 3 / 5;
print "10 * 3 / 5 = $var\n";

$var = (10 + 5) * 3;
print "(10 + 5) * 3 = $var\n";
