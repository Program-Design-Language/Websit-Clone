#! ruby -Ks

youbi = %w[“ú Œ ‰Î … –Ø ‹à “y]

t = Time.now

print(t.year, "”N", t.month, "Œ", t.day, "“ú\n")
print(youbi[t.wday], "—j“ú\n")
print(t.hour, "", t.min, "•ª", t.sec, "•b\n")
print("TimeZone:", t.zone, "\n")
print("¡”N‚ÌŒ³’U‚©‚ç”‚¦‚Ä", t.yday, "“ú–Ú\n")
