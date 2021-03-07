use strict;
use warnings;
use utf8;
use open ":utf8";
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

open(DATAFILE, ">", "data7-1.txt") or die("Error:$!");

print DATAFILE "加藤 花子\n";
print DATAFILE "東京都新宿区\n";
print DATAFILE "女性";

close(DATAFILE);

open(DATAFILE, ">", "data7-2.txt") or die("Error:$!");

print DATAFILE "山崎 一郎\n";
print DATAFILE "大阪府吹田市\n";
print DATAFILE "男性";

close(DATAFILE);
