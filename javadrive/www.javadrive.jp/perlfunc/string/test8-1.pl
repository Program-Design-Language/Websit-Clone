use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $str = sprintf("[%#5o]", 30);
print "変換結果:$str\n";

my $shortstr = sprintf("%.3s", "September");
print "変換結果:$shortstr\n";
