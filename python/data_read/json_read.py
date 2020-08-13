 #!/usr/bin/python
# -*- coding: UTF-8 -*-

# 使用  python 脚本来读取 json 文件内容

import json

json_data = open('data-test.json').read()
print(type(json_data))
data =  json.loads(json_data)
print(type(data))
for item in data:
  print(item)
  print(data[item])