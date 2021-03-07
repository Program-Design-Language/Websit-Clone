use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

printf("%f\n", 0.012);
printf("%.4f\n", 0.012);
printf("%e\n", 0.012);
printf("%.3e\n", 0.012);

printf("[%.4d]\n", 123);
printf("[%.6d]\n", 123);
printf("[%8.6d]\n", 123);

printf("[%.6x]\n", 123);
printf("[%#.6x]\n", 123);

printf("[%s]\n", "Javascript");
printf("[%.5s]\n", "Javascript");
