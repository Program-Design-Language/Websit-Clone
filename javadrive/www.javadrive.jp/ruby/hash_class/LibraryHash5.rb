#! ruby -Ks

h = {"suzuki" => 87, "itou" => 76, "yamada" => 69}
p h

print("�L�[�Fitou���폜���܂�\n")
h.delete("itou")
p h

print("�L�[�Fkudou���폜���܂�\n")
h.delete("kudou"){|key|
  print("#{key} �͑��݂��܂���\n")
}
p h
