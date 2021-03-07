#! ruby -Ks

require "date"

d = DateTime.now

print(d.year, "”N", d.month, "ŒŽ", d.day, "“ú\n")
print(d.hour, "Žž", d.min, "•ª", d.sec, "•b", d.zone, "\n")
print("Offset:", d.offset, "\n")

