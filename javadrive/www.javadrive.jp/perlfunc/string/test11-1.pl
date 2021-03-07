use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num1 = hex("3B");
my $num2 = hex("0xa4");

print "3B -> $num1\n";
print "0xa4 -> $num2\n";
