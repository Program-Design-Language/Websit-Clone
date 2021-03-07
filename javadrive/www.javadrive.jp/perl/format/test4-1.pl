use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

printf("[%d]\n", 30);
printf("[% d]\n", 30);
printf("[% d]\n", -30);

printf("[%d]\n", 30);
printf("[%+d]\n", 30);
printf("[%+d]\n", -30);

printf("[%4d]\n", 30);
printf("[%-4d]\n", 30);

printf("[%4d]\n", 30);
printf("[%04d]\n", 30);

printf("[%#o]\n", 30);
printf("[%#x]\n", 30);
printf("[%#b]\n", 30);
