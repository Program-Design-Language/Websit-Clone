use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = int(3.14);
print "int(3.14) = $num\n";

$num = int(7.692);
print "int(7.692) = $num\n";

$num = int(-0.123);
print "int(-0.123) = $num\n";
