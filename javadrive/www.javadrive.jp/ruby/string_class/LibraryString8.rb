#! ruby -Ks

str = "Hello"
print("�Ώۂ̕�����F", str, "\n")
print("�ul�v���܂܂�邩�ǂ������������܂�\n")

check = str.include?("l")
if check
  print("������̒��Ɂul�v�͊܂܂�܂�\n")

  lpos = str.index("l")
  rpos = str.rindex("l")

  print("�����猟���������ʂ̈ʒu��", lpos, "�ł�\n")
  print("�E���猟���������ʂ̈ʒu��", rpos, "�ł�\n")
else
  print("������̒��Ɂul�v�͊܂܂�܂���\n")
end
