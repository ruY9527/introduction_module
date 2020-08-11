 #!/usr/bin/python
# -*- coding: UTF-8 -*-

'''
    多进程Coding use python
'''

import multiprocessing
import time

def dance():
    for i in range(3):
        print('跳舞中')
        time.sleep(0.2)

def sing():
    for i in range(3):
        print('唱歌中')
        time.sleep(0.2)        

dance_process = multiprocessing.Process(target=dance)
sing_process = multiprocessing.Process(target=sing)        

# 启动进程执行任务
dance_process.start()
sing_process.start()