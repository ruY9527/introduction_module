 #!/usr/bin/python
# -*- coding: UTF-8 -*-

# 操作 python 的一些方法, 比如 replace/split/join 等方法

mystr = "hello world and GavinYang and Peterwong and Python"

# 默认是替换素有的
new_str = mystr.replace('and','&')
# 指定1的话,就会只替换掉1个,也就是最初的    
new_str_one = mystr.replace('and','&',1)

print(new_str_one)
print(new_str)

# capitalize() 首字符转化为大写
big_new_str = mystr.capitalize()
print(big_new_str)


# strip(): 删除字符串二边的空格

# isdigit(): 判断是不是数字
