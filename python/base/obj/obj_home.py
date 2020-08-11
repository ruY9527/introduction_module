 #!/usr/bin/python
# -*- coding: UTF-8 -*-

class Furniture():
    def __init__(self,name,area):
        self.name = name
        self.area = area

class Home():
    def __init__(self,address,area):
        self.address = address
        self.area = area
        self.free_area = area
        self.furniture = []

    def __str__(self):
        return f'房子地理位置位于 {self.address} , 房屋面积是  {self.area} , 剩余面积是 {self.free_area} , 家具有 {self.furniture}'

    def add_furniture(self,item):
        if item.area <= self.free_area:
            self.furniture.append(item.area)
            self.free_area -= item.area
        else:
            print('面积不够使用了')    

    #pass

# 双人床， 6
bed = Furniture('双人床', 6)
sofa = Furniture('沙发', 10)

# 房子1： 北京, 1000
jia1 = Home('北京', 1000)
print(jia1)

jia1.add_furniture(bed)
print(jia1)

ball = Furniture('篮球场', 2000)
jia1.add_furniture(ball)

print(jia1)

