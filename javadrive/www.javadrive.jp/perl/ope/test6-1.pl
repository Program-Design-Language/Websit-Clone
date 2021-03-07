use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($src, $dst);

$src = 11;
$dst = $src & 14;
print "$src \& 14 = $dst\n";

$src = 10;
$dst = $src | 12;
print "$src | 12 = $dst\n";

$src = 10;
$dst = $src ^ 12;
print "$src ^ 12 = $dst\n";

$src = 10;
$dst = ~$src;
print "~$src = $dst\n";
