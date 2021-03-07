use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

sub hello{
  print "hello\n";
}

print "サブルーチンのテスト\n";

sub bye{
  print "bye\n";
}

print "終了\n";
