use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "abc\ndef\n";
print "abc\\ndef\n";
print "aaa\"bbb\n";
