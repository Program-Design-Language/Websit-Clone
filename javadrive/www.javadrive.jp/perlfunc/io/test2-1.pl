use strict;
use warnings;
use utf8;
use open ":utf8";
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

open(DATAFILE, "< data.txt") or die("Error");

if (close(DATAFILE)){
  print "ファイルは閉じるのに成功しました\n";
}else{
  print "ファイルは閉じるのに失敗しました\n";
}

if (close(DATAFILE)){
  print "ファイルは閉じるのに成功しました\n";
}else{
  print "ファイルは閉じるのに失敗しました\n";
}

