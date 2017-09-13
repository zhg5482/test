#!/usr/bin/python
# -*- coding: UTF-8 -*-
from functools import reduce

print('================== 单词首字母大写 其他小写转换>>>>>>>>>>>>>>>>>>>>>')
L1 = ['adam', 'LISA', 'barT']

def normalize(name):
	    return name.capitalize()

print(list(map(normalize,L1)))


print('================== list 求积 >>>>>>>>>>>>>>>>>>')
def prod(L):
	return reduce(lambda x, y: x * y, L)

print('3 * 5 * 7 * 9 =', prod([3, 5, 7, 9]))


print('=================== strtofloat >>>>>>>>>>>>>>>>>>>>>>')

def fn(x, y):
	return x * 10 + y

def char2num(s):
	return {'0': 0, '1': 1, '2': 2, '3': 3, '4': 4, '5': 5, '6': 6, '7': 7, '8': 8, '9': 9}[s]

def str2float(n):
	if n.find('.') == -1:
		return reduce(fn, map(char2num, n))
	else:
		return reduce(fn, map(char2num,n.split('.')[0])) + reduce(fn, map(char2num,n.split('.')[1])) / (10 ** len(n.split('.')[1]))

print('str2float(\'123.456\') =', str2float('123.456'))
print(str2float('123'))
