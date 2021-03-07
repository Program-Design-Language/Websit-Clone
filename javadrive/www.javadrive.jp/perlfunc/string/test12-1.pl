use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num1 = oct("045");
my $num2 = oct("0xA4");
my $num3 = oct("0b1101");
my $num4 = oct("37");

print "045 -> $num1\n";
print "0xA4 -> $num2\n";
print "0b1101 -> $num3\n";
print "37 -> $num4\n";
