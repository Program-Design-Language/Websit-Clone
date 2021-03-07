use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = "こんにちは\n";

print $str;
print $str;
print $str;

$str = "こんばんは\n";

print $str;
print $str;
print $str;
