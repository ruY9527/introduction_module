 #!/usr/bin/python
# -*- coding: UTF-8 -*-


class Washer():

    def wash(self):
        print('做洗衣服')


class Person():
    
    def __init__(self):
        self.name = 'GavinYang'
        self.age = 12

    def printInfo(self):
        print(f'人的名字是 {self.name}')
        print(f'人的年龄是 {self.age}')   

    def __str__(self):
        return '重写的打印方法在Person类中'     


gavin = Washer()
print(gavin)
gavin.wash()

print('------分割线-------------')
gavin.name = 'GavinYang'
gavin.age = 23
print(f'名字是:{gavin.name}')
print(f'年龄是: {gavin.age}')

print('----华丽分割线--------')
au = Person()
au.printInfo()
print(au)