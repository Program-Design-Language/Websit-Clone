#! ruby -Ks

t = Time.now
timeInteger = t.tv_sec
timeFloat = t.to_f

print("���ݎ���:" , t, "\n")
print("�o�ߕb��(����)", timeInteger, "\n")
print("�o�ߕb��(���������_��)", timeFloat, "\n\n")

timeInteger = timeInteger + 3600

newTime = Time.at(timeInteger)
print("1���Ԍ�̎���:" , newTime, "\n")
