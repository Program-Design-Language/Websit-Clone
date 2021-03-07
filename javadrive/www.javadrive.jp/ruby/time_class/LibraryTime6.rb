#! ruby -Ks

t = Time.now
timeInteger = t.tv_sec
timeFloat = t.to_f

print("Œ»İ:" , t, "\n")
print("Œo‰ß•b”(®”)", timeInteger, "\n")
print("Œo‰ß•b”(•‚“®¬”“_”)", timeFloat, "\n\n")

timeInteger = timeInteger + 3600

newTime = Time.at(timeInteger)
print("1ŠÔŒã‚Ì:" , newTime, "\n")
