use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $target = "melon";
my $ucstr = uc($target);
print "$target -> $ucstr\n";

my $ucfirststr = ucfirst($target);
print "$target -> $ucfirststr\n";
