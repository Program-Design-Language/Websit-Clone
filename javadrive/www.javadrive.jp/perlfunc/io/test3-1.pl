use strict;
use warnings;
use utf8;
use open ":utf8";
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

print "Hello\n";
print STDOUT "こんにちは\n";

my $name = "安藤";
my $old = 16;

print $name, "=", $old, "\n";

open(DATA, ">", "data3-1.txt");
print DATA "sample";
close(DATA);
