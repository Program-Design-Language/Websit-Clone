use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $pai = 3.14159;
my $num;

$num = sin($pai / 4);
print "sin(π/4) = $num\n";

$num = sin($pai / 6);
print "sin(π/6) = $num\n";
