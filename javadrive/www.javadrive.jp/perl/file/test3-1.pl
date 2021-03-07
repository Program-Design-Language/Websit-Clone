use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

open(DATAFILE, "data.txt") or die("error :$!");
print "data.txtを開く事に成功しました\n";

close(DATAFILE);

open(DATAFILE, "data1.txt") or die("error :$!");
print "data1.txtを開く事に成功しました\n";

close(DATAFILE);
