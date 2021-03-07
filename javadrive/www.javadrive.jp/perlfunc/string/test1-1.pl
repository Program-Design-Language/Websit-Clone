use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $num;

$num = length("Hello");
print "Hello = $num\n";

$num = length("こんにちは");
print "こんにちは = $num\n";

$num = bytes::length("こんにちは");
print "こんにちは = $num\n";
