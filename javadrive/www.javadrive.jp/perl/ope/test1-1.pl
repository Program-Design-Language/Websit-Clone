use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $var;

$var = 8 + 3;
print "8 + 3 = $var\n";

$var = 4 ** 3;
print "4 ** 3 = $var\n";

$var = 8 / 4;
print "8 / 4 = $var\n";

$var = 7 / 3;
print "7 / 3 = $var\n";
