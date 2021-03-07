use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

my $seiseki;

$seiseki = 75;
print "得点 = $seiseki\n";
if ($seiseki > 60){
  print "合格です\n";
  print "おめでとう\n";
}

print "お疲れ様\n";

$seiseki = 47;
print "得点 = $seiseki\n";
if ($seiseki > 60){
  print "合格です\n";
  print "おめでとう\n";
}

print "お疲れ様\n";
