use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my ($seiseki, $kekka);

$seiseki = 75;
$kekka = $seiseki > 60 ? "合格" : "不合格";
print $kekka;
