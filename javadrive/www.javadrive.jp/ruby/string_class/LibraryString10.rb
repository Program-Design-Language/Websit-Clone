#! ruby -Ks

str = "Hello\n"
print("対象の文字列：", str, "\n")
print("改行確認用の行\n")

newStr = str.chomp
print("末尾の改行文字を削除した結果:", newStr, "\n")
print("改行確認用の行\n")

