#! ruby -Ks

ary = ["����", "���", "���É�", "����", "�D�y"]

newary = ary[1..3]

print("���̔z��:\n")
ary.each do |youso|
  print(youso, "\n")
end

print("�V�����z��:\n")
newary.each do |youso|
  print(youso, "\n")
end
