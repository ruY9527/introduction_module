 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    python 进行 rds 的连接
'''

import redis

if __name__ == "__main__":
    try:
        rs = redis.Redis()
        result =  rs.set('name','GavinYang')
        print(result)
    except Exception as e:
        print(e)

