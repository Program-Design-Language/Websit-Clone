#! ruby -Ks

require "date"

d = Date.today

print(d.strftime("%Y年 %m月 %d日"), "\n")
print(d.strftime("%Y年 %m月 %d日, %H:%M:%S"), "\n")
