 #!/usr/bin/python
# -*- coding: UTF-8 -*-

age = int(input('请输入你的年龄: '))

# 数据语句前面加上f的话,可以渲染出 {age} 的效果
if age >= 18:
    print(f'你是OK的,年龄是: {age}')
else:
    print(f'你是不OK的,年龄是: {age}')        