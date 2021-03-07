#! ruby -Ks

require "date"

d = Date.today
print(d.strftime("%Y年 %m月 %d日, %H:%M:%S"), "\n")

dt = DateTime.now
print(dt.strftime("%Y年 %m月 %d日, %H:%M:%S"), "\n")
