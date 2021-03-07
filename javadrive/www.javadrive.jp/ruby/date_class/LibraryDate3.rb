#! ruby -Ks

require "date"

youbi = %w[日 月 火 水 木 金 土]

d = Date.today

print(d.year, "年", d.month, "月", d.day, "日\n")
print(youbi[d.wday], "曜日\n")
print("本日は今年の", d.cweek, "週目\n")
print("1月1日から数えて", d.yday, "日目\n")
