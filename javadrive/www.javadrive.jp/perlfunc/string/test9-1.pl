use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $src = "abcde";
print "削除前 : $src\n";

my $choppedstr = chop($src);
print "削除後 : $src\n";
print "削除された文字 : $choppedstr\n";
