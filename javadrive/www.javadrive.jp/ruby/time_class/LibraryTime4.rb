#! ruby -Ks

t = Time.now
strTime = t.strftime("���ݎ��� %H�� %M�� %S�b")
print(strTime, "\n")

strDay = t.strftime("���ݓ��� %B,%d(%A) %Y %Z")
print(strDay, "\n")
