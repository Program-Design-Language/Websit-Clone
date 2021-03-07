use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $target = "My name is Gotou.";
print "$target\n";

print "\n空白で分割:\n";

my @list = split(/ /, $target);
foreach my $parts(@list){
  print "$parts\n";
}

print "\n最大数2として空白で分割:\n";

@list = split(/ /, $target, 2);
foreach my $parts(@list){
  print "$parts\n";
}

