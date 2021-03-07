use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $target = "Hamamatsu";
print "検索対象:$target, 検索文字:ma\n";

my $pos;
$pos = index($target, "ma");
print "開始0, 位置:$pos\n";

$pos = index($target, "ma", 2);
print "開始2, 位置:$pos\n";

$pos = index($target, "ma", 3);
print "開始3, 位置:$pos\n";

$pos = index($target, "ma", 4);
print "開始4, 位置:$pos\n";

$pos = index($target, "ma", 5);
print "開始5, 位置:$pos\n";
