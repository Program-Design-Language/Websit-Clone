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

foreach my $key(keys(%address)){
  print "$address{$key}\n";
}

while (my ($key, $value) = each(%address)){
  print "key=$key, value=$value\n";
}
