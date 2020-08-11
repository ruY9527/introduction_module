 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    集合删除数据操作
'''

s1 = {10, 20, 30, 40, 50}

# remove 方法,如果删除了没有的数据话,就会报错.
# discard 方法,如果删除了没有的数据话,也不会报错.
s1.discard(10)