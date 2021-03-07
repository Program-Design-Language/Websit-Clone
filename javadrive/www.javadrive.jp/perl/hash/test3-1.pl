use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my %address = (
"鈴木" => "東京都千代田区",
"山田" => "東京都葛飾区"
);

print "$address{'鈴木'}\n";
print "$address{'山田'}\n";
