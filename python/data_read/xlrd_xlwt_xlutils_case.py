# -*- coding: utf-8 -*-
"""
@Time ： 2020/8/28 23:28
@Auth ： GavinYang
@File ：xlrd_xlwt_xlutils_case.py
@IDE ：PyCharm
@Motto： 多反思是否还有更好的实现方式
@Desc: python 中操作Excel的包,
       xlrd: 读取Excel文件
       xlwt: 向Excel中写入数据,并设置格式
       xlutils: 一些Excel高级操作工具(需要先安装前二者才行)
"""

import xlrd

book = xlrd.open_workbook('SOWC 2014 Stat Tables_Table 9.xlsx')
sheet =  book.sheet_by_name('Table 9 ')
for i in range(sheet.nrows):
  print(i)