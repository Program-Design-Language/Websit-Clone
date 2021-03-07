use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $name = "加藤";
print "こんにちは $name さん\n";
print "こんにちは ".$name." さん\n";
print 'こんにちは $name さん'."\n";
print 'こんにちは '.$name.' さん'."\n";
