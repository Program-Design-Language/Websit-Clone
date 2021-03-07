#! ruby -Ks

str = "Tokyo,Osaka,Nagoya,,"

print("対象の文字列:", str, "\n")
print("カンマで分割します\n")

strAry = str.split(",")
strAry.each do |youso|
  print("[", youso, "]\n")
end

print("カンマで分割します\n")

strAry = str.split(",", -1)

strAry.each do |youso|
  print("[", youso, "]\n")
end

print("カンマで分割します。最大分割数は2です\n")

strAry = str.split(",", 2)

strAry.each do |youso|
  print("[", youso, "]\n")
end
