 #!/usr/bin/python
# -*- coding: UTF-8 -*-
'''
    使用 字符串的 API / find 来寻找文件内容
'''

mystr = "hello world and GavinYang and Peterwong and Python"

# 如果 find 的数据是存在的话,就会返回对应下标的值. 否则就会返回-1.  也就说如果是返回-1的话,就不存在
# find 方法使用
print(mystr.find('ands'))


# index() 方法使用
# 如果存在的话,就会返回对应下标的值,否则的话,就会报错.
print(mystr.index('and'))


# count() 方法使用
# 如果有的话,就会对应的次数. 如果没有的话,就会返回0来.  也都是可以指定从那些下标位置开始读取进行处理的
print(mystr.count('ands'))

