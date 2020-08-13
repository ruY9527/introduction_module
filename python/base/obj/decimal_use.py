

from decimal import getcontext,Decimal

# Decimal 可以实现精度计算. 比如 0.1 + 0.2 的情况
getcontext().prec = 1
print(Decimal(0.1) + Decimal(0.2))