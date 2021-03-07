#! ruby -Ks

str = "Hello"
print("対象の文字列：", str, "\n")
print("「l」が含まれるかどうかを検索します\n")

check = str.include?("l")
if check
  print("文字列の中に「l」は含まれます\n")

  lpos = str.index("l")
  rpos = str.rindex("l")

  print("左から検索した結果の位置は", lpos, "です\n")
  print("右から検索した結果の位置は", rpos, "です\n")
else
  print("文字列の中に「l」は含まれません\n")
end
