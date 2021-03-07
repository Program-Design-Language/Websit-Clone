#! ruby -Ks

require "date"

youbi = %w[“ú Œ ‰Î … –Ø ‹à “y]

d = Date.today

print(d.year, "”N", d.month, "Œ", d.day, "“ú\n")
print(youbi[d.wday], "—j“ú\n")
print("–{“ú‚Í¡”N‚Ì", d.cweek, "T–Ú\n")
print("1Œ1“ú‚©‚ç”‚¦‚Ä", d.yday, "“ú–Ú\n")
