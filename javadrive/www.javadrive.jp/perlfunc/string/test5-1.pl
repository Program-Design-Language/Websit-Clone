use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $target = "Hamamatsu";
print "検索対象:$target, 検索文字:ma\n";

my $pos;
$pos = rindex($target, "ma");
print "終了末, 位置:$pos\n";

$pos = rindex($target, "ma", 5);
print "終了5, 位置:$pos\n";

$pos = rindex($target, "ma", 4);
print "終了4, 位置:$pos\n";

$pos = rindex($target, "ma", 3);
print "終了3, 位置:$pos\n";

$pos = rindex($target, "ma", 2);
print "終了2, 位置:$pos\n";

$pos = rindex($target, "ma", 1);
print "終了1, 位置:$pos\n";
