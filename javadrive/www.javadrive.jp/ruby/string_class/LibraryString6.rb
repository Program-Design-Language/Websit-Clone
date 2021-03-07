#! ruby -Ks

str = "Hello"
print("対象の文字列：", str, "\n")

str[1] = "oo"
print("str[1] = \"oo\"の場合：", str, "\n")

str = "Hello"
str[1, 2] = "oo"
print("str[1, 2] = \"oo\"の場合：", str, "\n")

str = "Hello"
str[2..3] = "pp"
print("str[2..3] = \"pp\"の場合：", str, "\n")

str = "Hello"
str[2...3] = "pp"
print("str[2...3] = \"pp\"の場合：", str, "\n")

