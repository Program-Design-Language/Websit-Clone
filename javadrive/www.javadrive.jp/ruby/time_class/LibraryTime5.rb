#! ruby -Ks

jikokuyouso = %w[•b •ª  “ú Œ ”N —j“ú ”N“à’ÊZ“ú ‰ÄŠÔ ƒ^ƒCƒ€ƒ][ƒ“]

t = Time.now
ary = t.to_a

index = 0

ary.each do |youso|
  print(jikokuyouso[index] , ":", youso, "\n")
  index += 1
end
