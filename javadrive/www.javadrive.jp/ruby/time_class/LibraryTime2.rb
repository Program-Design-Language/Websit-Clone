#! ruby -Ks

youbi = %w[�� �� �� �� �� �� �y]

t = Time.now

print(t.year, "�N", t.month, "��", t.day, "��\n")
print(youbi[t.wday], "�j��\n")
print(t.hour, "��", t.min, "��", t.sec, "�b\n")
print("TimeZone:", t.zone, "\n")
print("���N�̌��U���琔����", t.yday, "����\n")
