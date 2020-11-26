 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    Python 中面向对象的练习
'''


class people:
  # 定义基本属性
  name = ''
  age = 0

  # 定义私有属性
  __weight = 0

  def __init__(self,n,a,w):
    self.name = n
    self.age = a
    self.__weight = w

  def speak(self):
    print("%s 说: 我 %d 岁. " %(self.name,self.age))  

'''
  子类
  实现 people 类.
'''
class student(people):
  grade = ''
  def __init__(self,n,a,w,g):
    # 调用父类的构造函数
    print('Enter Student Class Init Function.')
    people.__init__(self,n,a,w)
    self.grade = g

  # 重写父类的方法
  def speak(self):
    print("%s 说: 我 %d 岁了，我在读 %d 年级"%(self.name,self.age,self.grade))

      
if __name__ == "__main__":
  s = student('ken',10,60,3)
  s.speak()
