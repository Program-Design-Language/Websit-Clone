#! ruby -Ks

require "date"

youbi = %w[�� �� �� �� �� �� �y]

d = Date.today

print(d.year, "�N", d.month, "��", d.day, "��\n")
print(youbi[d.wday], "�j��\n")
print("�{���͍��N��", d.cweek, "�T��\n")
print("1��1�����琔����", d.yday, "����\n")
