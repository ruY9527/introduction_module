 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    列表基础代码的Coding
'''

name_list = ['TOM', 'Lily', 'ROSE']
print('GavinYang' in name_list)

#name_list.append('GavinYang')
#name_list.append('PeterWong')

# 当一个集合给添加进入了
#name_list.append(['GavinYang','PeterWong'])
# result : ['TOM', 'Lily', 'ROSE', ['GavinYang', 'PeterWong']]

name_list.extend(['GavinYang','PeterWong'])
# result: ['TOM', 'Lily', 'ROSE', 'GavinYang', 'PeterWong']
# 可以看到 append 和 extend的效果

print(name_list)

# 可以对下标的值 和 value 都是可以打印出来的
for i,value in enumerate(name_list):
    print(i)
    print(value)
    print('-------------')