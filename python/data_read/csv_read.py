 #!/usr/bin/python
# -*- coding: UTF-8 -*-

# csv 格式数据的读取

import csv

csv_file = open('data-text.csv','rb')
#reader = csv.reader(csv_file)
# DictReader: 每一个数据记录变成一个字典.
reader =  csv.DictReader(csv_file)
for row in reader:
  print(row)