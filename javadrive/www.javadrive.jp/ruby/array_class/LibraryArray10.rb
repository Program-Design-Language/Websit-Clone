#! ruby -Ks

ary = ["����", "���", "���É�", "����", "�D�y"]

print("���̔z��:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1, 0] = ["���l", "�_��"]

print("1�Ԗڂ̈ʒu��2�̗v�f��}��:\n")
ary.each do |youso|
  print(youso, "\n")
end
