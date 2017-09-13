#!/usr/bin/python
# -*- coding: UTF-8 -*-
from functools import reduce

def fn(x,y):
	return x * 10 + y

def char2num(s):
	return {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}[s]

print('================= str 转 int >>>>>>>>>>>>>>>>>>')
print(reduce(fn,map(char2num,'13579')))

def str2int(s):
	def fn(x,y):
		return x * 10 + y
	def char2num(s):
		return {'0':0,'1':1,'2':2,'3':3,'4':4,'5':5,'6':6,'7':7,'8':8,'9':9}[s]
	return reduce(fn,map(char2num,s))

print('=================== str2int >>>>>>>>>>>>>>>>>>>>')
print(str2int('13579'))


def str2int2(s):
	return reduce(lambda x, y: x * 10 + y,map(char2num,s))

print('=================== lambda >>>>>>>>>>>>>>>>>>>>>')
print(str2int2('13579'))

