use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $var;

$var = 9;
$var += 5;

print "$var\n";

$var /= 2;
print "$var\n";
