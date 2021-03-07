use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $target = "MELON";
my $lcstr = lc($target);
print "$target -> $lcstr\n";

my $lcfirststr = lcfirst($target);
print "$target -> $lcfirststr\n";
