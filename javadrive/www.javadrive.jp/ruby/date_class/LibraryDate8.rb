#! ruby -Ks

require "date"

d = Date.today
print(d.strftime("%Y�N %m�� %d��, %H:%M:%S"), "\n")

dt = DateTime.now
print(dt.strftime("%Y�N %m�� %d��, %H:%M:%S"), "\n")
