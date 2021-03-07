use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $sub;

$sub = substr("Morning", 2);
print "substr(\"Morning\", 2) = $sub\n";

$sub = substr("Morning", -2);
print "substr(\"Morning\", -2) = $sub\n";

$sub = substr("Morning", 1, 2);
print "substr(\"Morning\", 1, 2) = $sub\n";

$sub = substr("Morning", 1, -2);
print "substr(\"Morning\", 1, -2) = $sub\n";

my $targetstr = "Hello Satou";
print "old = $targetstr\n";
substr($targetstr, 5, 1, " Mr.");
print "new = $targetstr\n";
