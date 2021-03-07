#! ruby -Ks

ary = [1, 2, 3, nil, 4, nil]
newary = ary.compact

p ary
p newary

ary = [1, 2, 3, nil, 4, nil]
ary.compact!

p ary
