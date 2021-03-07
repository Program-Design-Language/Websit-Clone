use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @array = ("1月", "2月");

my $length = @array;

print "要素数 $length\n";
print @array;
