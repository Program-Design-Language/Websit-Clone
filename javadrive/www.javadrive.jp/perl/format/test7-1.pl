use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

printf("[%.6d]\n", 123);
printf("[%.*d]\n", 6, 123);

printf("[%s] [%.*s] \n", "Hello", 3, "Hello");
