#! ruby -Ks

str = "Hello"
print("�Ώۂ̕�����F", str, "\n")

str[1] = "oo"
print("str[1] = \"oo\"�̏ꍇ�F", str, "\n")

str = "Hello"
str[1, 2] = "oo"
print("str[1, 2] = \"oo\"�̏ꍇ�F", str, "\n")

str = "Hello"
str[2..3] = "pp"
print("str[2..3] = \"pp\"�̏ꍇ�F", str, "\n")

str = "Hello"
str[2...3] = "pp"
print("str[2...3] = \"pp\"�̏ꍇ�F", str, "\n")

