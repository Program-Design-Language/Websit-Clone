#! ruby -Ks

ary = ["����", "���", "���É�", "����", "�D�y"]

print("���̔z��:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1, 3] = ["���l", "�_��"]

print("1�Ԃ���3�̗v�f��2�̗v�f�Œu������:\n")
ary.each do |youso|
  print(youso, "\n")
end
