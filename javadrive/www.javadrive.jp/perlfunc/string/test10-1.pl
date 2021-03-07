use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $src1 = "abc\n";
my $src2 = "def";
my $src3 = "ghi\n";
print "削除前 : (start)$src1,$src2,$src3(end)\n";

my $num1 = chomp($src1);
my $num2 = chomp($src2);
my $num3 = chomp($src3);
print "削除後 : (start)$src1,$src2,$src3(end)\n";
print "削除された文字数 : $num1,$num2,$num3\n";
