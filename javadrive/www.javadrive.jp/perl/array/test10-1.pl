use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my @name = ("加藤", "山田", "林");
print "登録されているのは @name です\n";
print '登録されているのは @name です';

print "\n";
$" = ",";
print "登録されているのは @name です\n";
