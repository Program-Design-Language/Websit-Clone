#! ruby -Ks

require "date"

d = DateTime.now

print(d.year, "�N", d.month, "��", d.day, "��\n")
print(d.hour, "��", d.min, "��", d.sec, "�b", d.zone, "\n")
print("Offset:", d.offset, "\n")

