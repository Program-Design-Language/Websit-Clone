#! ruby -Ks

keyAry = ["suzuki", "itou", "yamada"]
keyValue = [87, 76, 69]
ary = [keyAry,keyValue].transpose
h = Hash[*ary.flatten]

p h
