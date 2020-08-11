 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    对dict字典进行迭代操作.
'''

name_dict = {'name': 'TOM', 'age': 20, 'gender': '男'}
for key,value in name_dict.items():
    print(key)
    print(value)
    print(f'{key} == {value}')
    print('-----------')