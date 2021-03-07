use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $msg;

$msg = &hantei(72, 84);
print "$msg\n";

$msg = &hantei(92, 80);
print "$msg\n";

sub hantei{
  my ($kokugo, $suugaku) = @_;

  if ($kokugo < 75){
    return "不合格";
  }

  if ($suugaku < 75){
    return "不合格";
  }

  return "合格";
}
