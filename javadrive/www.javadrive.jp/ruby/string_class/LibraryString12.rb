#! ruby -Ks

str = "Tokyo,Osaka,Nagoya,,"

print("�Ώۂ̕�����:", str, "\n")
print("�J���}�ŕ������܂�\n")

strAry = str.split(",")
strAry.each do |youso|
  print("[", youso, "]\n")
end

print("�J���}�ŕ������܂�\n")

strAry = str.split(",", -1)

strAry.each do |youso|
  print("[", youso, "]\n")
end

print("�J���}�ŕ������܂��B�ő啪������2�ł�\n")

strAry = str.split(",", 2)

strAry.each do |youso|
  print("[", youso, "]\n")
end
