 #!/usr/bin/python
# -*- coding: UTF-8 -*-

# 使用迭代来进行累加数据

i = 2
result = 0

#每次加减的大小是可以决定一定的逻辑代码
while i <= 100:
    result += i
    i += 2
print(result)