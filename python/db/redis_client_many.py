 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    python 进行 多个 redis 的情况
    安装引入进来的依赖:  pip install redis-py-cluster
'''

from rediscluster import StrictRedisCluster

if __name__ == "__main__":
    nodes = [{'host':'192.168.229.148','port':'7000'},
             {'host':'192.168.229.148','port':'7001'},
             {'host':'192.168.229.148','port':'7002'}]

    try:
        src = StrictRedisCluster(startup_nodes=nodes) 
        result = src.set('age',15)
        print(result) 
    except Exception as e:
        print(e)     
