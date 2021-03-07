use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my %names;

$names{"鈴木"}= "一郎";
$names{'山田'}= "太郎";

my $name = "山田";
print "$names{$name}\n";
