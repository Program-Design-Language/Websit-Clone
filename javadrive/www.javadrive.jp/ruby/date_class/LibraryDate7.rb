#! ruby -Ks

require "date"

d = DateTime.now

print(d.year, "年", d.month, "月", d.day, "日\n")
print(d.hour, "時", d.min, "分", d.sec, "秒", d.zone, "\n")
print("Offset:", d.offset, "\n")

