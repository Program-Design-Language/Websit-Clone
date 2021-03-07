use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

printf("%d\n", 30);
printf("%x\n", 30);
printf("%o\n", 30);
printf("%c\n", 65);
printf("%c\n", 66);
printf("%e\n", 0.00123);
printf("%f\n", 0.00123);
printf("%s=%d%%\n", "確率", 90);
my $count;
printf("数値は%d%n\n", 45, $count);
print "バイト数は$count\n";
