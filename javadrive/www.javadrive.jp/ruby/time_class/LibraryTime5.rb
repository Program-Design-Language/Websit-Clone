#! ruby -Ks

jikokuyouso = %w[�b �� �� �� �� �N �j�� �N���ʎZ�� �Ď��� �^�C���]�[��]

t = Time.now
ary = t.to_a

index = 0

ary.each do |youso|
  print(jikokuyouso[index] , ":", youso, "\n")
  index += 1
end
