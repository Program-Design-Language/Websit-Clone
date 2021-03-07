#! ruby -Ks

str1 = "Hello"
str2 = "Hello"
str3 = "hello"

print(str1 == str2, "\n")
print(str1 != str2, "\n")
print(str1 == str3, "\n")

str4 = "•¶Žš—ñ"
if str4 == "•¶Žš—ñ"
  print("“™‚µ‚¢\n")
else
  print("“™‚µ‚­–³‚¢\n")
end

str5 = "abc"
str6 = "def"
str7 = "ABC"

if str5 > str6
  print(str5, "‚Ì•û‚ª", str6, "‚æ‚è‘å‚«‚¢\n")
else
  print(str6, "‚Ì•û‚ª", str5, "‚æ‚è‘å‚«‚¢\n")
end

if str5 > str7
  print(str5, "‚Ì•û‚ª", str7, "‚æ‚è‘å‚«‚¢\n")
else
  print(str7, "‚Ì•û‚ª", str5, "‚æ‚è‘å‚«‚¢\n")
end
