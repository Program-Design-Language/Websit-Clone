use strict;
use warnings;
use utf8;
binmode STDIN, ':encoding(cp932)';
binmode STDOUT, ':encoding(cp932)';
binmode STDERR, ':encoding(cp932)';

if (open(DATAFILE, "data.txt")){
  print "data.txtを開く事に成功しました\n";

  if (close(DATAFILE)){
    print "data.txtを閉じる事に成功しました\n";
  }else{
    print "data.txtを閉じる事に失敗しました\n";
  }
}else{
  print "data.txtを開く事に失敗しました\n";
}

if (open(DATAFILE, "data1.txt")){
  print "data1.txtを開く事に成功しました\n";

  if (close(DATAFILE)){
    print "data1.txtを閉じる事に成功しました\n";
  }else{
    print "data1.txtを閉じる事に失敗しました\n";
  }
}else{
  print "data1.txtを開く事に失敗しました\n";
}
