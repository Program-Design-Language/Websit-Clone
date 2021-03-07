#! ruby -Ks

ary = [1, 2, 3, 5, 4, 3]
p ary

ary.delete_if {|x| x % 2 == 0}
p ary
