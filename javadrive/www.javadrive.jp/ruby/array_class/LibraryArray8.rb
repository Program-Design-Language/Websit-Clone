#! ruby -Ks

ary = ["東京", "大阪", "名古屋", "福岡", "札幌"]

print("元の配列:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1..2] = ["osaka", "nagoya", "yokohama"]

print("1番から2番を3つの要素で置き換え:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1..3] = nil

print("1番から3番をnilで置き換え:\n")
ary.each do |youso|
  print(youso, "\n")
end
