use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($str1, $str2);
my $name = "伊藤";

($str1, $str2) = ($name, "東京都");

print "$str1\n";
print "$str2\n";

my ($num1, $num2);
my $zei = 0.5;

($num1, $num2) = (20 * $zei, 800);

print "$num1\n";
print "$num2\n";

($num1, $num2) = ($num2, $num1);

print "$num1\n";
print "$num2\n";
