#! ruby -Ks

str1 = "Hello"
str2 = "Hello"
str3 = "hello"

print(str1 == str2, "\n")
print(str1 != str2, "\n")
print(str1 == str3, "\n")

str4 = "文字列"
if str4 == "文字列"
  print("等しい\n")
else
  print("等しく無い\n")
end

str5 = "abc"
str6 = "def"
str7 = "ABC"

if str5 > str6
  print(str5, "の方が", str6, "より大きい\n")
else
  print(str6, "の方が", str5, "より大きい\n")
end

if str5 > str7
  print(str5, "の方が", str7, "より大きい\n")
else
  print(str7, "の方が", str5, "より大きい\n")
end
