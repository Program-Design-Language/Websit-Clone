#! ruby -Ks

ary = ["����", "���", "���É�", "����", "�D�y"]

print("���̔z��:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1..2] = ["osaka", "nagoya", "yokohama"]

print("1�Ԃ���2�Ԃ�3�̗v�f�Œu������:\n")
ary.each do |youso|
  print(youso, "\n")
end

ary[1..3] = nil

print("1�Ԃ���3�Ԃ�nil�Œu������:\n")
ary.each do |youso|
  print(youso, "\n")
end
