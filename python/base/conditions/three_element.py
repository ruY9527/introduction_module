 #!/usr/bin/python
# -*- coding: UTF-8 -*-

# 三元表达式

a = 1
b = 2
c = a if a > b else b
print(c)


aa = 10
bb = 16
# 如果 aa 大于 bb 的话,就会走 aa - bb 逻辑,否则就会走 bb -aa 逻辑
cc = aa - bb if aa > bb else bb -aa
print(cc)