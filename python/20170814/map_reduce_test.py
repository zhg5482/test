#!/usr/bin/python
# -*- coding: UTF-8 -*-
from functools import reduce

def f(x):
	return x * x

r = map(f,[1,2,3,4,5,6,7,8,9])
print(list(r))

print('=============返回 list >>>>>>>>>>>>')
L = []
for n in [1,2,3,4,5,6,7,8,9]:
	L.append(f(n))
print(L)

print('==============list 数字转为字符串>>>>>>>>>>>>')
print(list(map(str,[1,2,3,4,5,6,7,8,9])))

print('=================reduce>>>>>>>>>>>>>>>>>>>>>>')
def add(x,y):
	return x + y

print(reduce(add,[1,3,5,7,9]))

print('=====================>>>>>>>>>>>>>>>>>>>>>>>>')
def fn(x,y):
	return x * 10 + y

print(reduce(fn,[1,3,5,7,9]))
