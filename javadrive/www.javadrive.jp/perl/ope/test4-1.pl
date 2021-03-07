use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($var1, $var2);

$var1 = 9;
$var2 = $var1++;

print "$var1\n";
print "$var2\n";

$var1 = 9;
$var2 = ++$var1;

print "$var1\n";
print "$var2\n";
