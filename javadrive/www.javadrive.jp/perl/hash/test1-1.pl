use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my %address;

$address{'katou'}= "Tokyo";
$address{'山田'}= "大阪";

print "$address{'katou'} \n";
print "$address{'山田'} \n";
