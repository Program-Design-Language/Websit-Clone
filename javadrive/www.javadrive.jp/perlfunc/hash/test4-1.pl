use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my %address = (
"鈴木" => "東京都千代田区",
"山田" => "東京都葛飾区",
"本田" => "愛知県名古屋市",
"遠藤" => "大阪府堺市"
);

my $val = delete($address{'本田'});
print "削除された値:$val\n\n";

print "残っている要素\n";
while (my ($key, $value) = each(%address)){
  print "key=$key, value=$value\n";
}
