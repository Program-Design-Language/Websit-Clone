use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

printf("A=%d, B=%d\n", 123, 456);
printf("A=%2\$d, B=%1\$d\n", 123, 456);
printf("A=%2\$d, B=%2\$d\n", 123, 456);
printf("%2\$d, %d, %1\$d, %d\n", 123, 456);
