#! ruby -Ks

str1 = "Hello"
str2 = "Hello"
str3 = "hello"

print(str1 == str2, "\n")
print(str1 != str2, "\n")
print(str1 == str3, "\n")

str4 = "������"
if str4 == "������"
  print("������\n")
else
  print("����������\n")
end

str5 = "abc"
str6 = "def"
str7 = "ABC"

if str5 > str6
  print(str5, "�̕���", str6, "���傫��\n")
else
  print(str6, "�̕���", str5, "���傫��\n")
end

if str5 > str7
  print(str5, "�̕���", str7, "���傫��\n")
else
  print(str7, "�̕���", str5, "���傫��\n")
end
