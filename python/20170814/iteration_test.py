#!/usr/bin/python
# -*- coding: UTF-8 -*-
from collections import Iterable

d = {'a':1,'b':2,'c':3}
for key in d:
	print(key)

print('===========循环 values>>>>>>>>>>>>')
for value in d.values():
	print(value)

print('============循环 k v >>>>>>>>>>>')
for k,v in d.items():
	print('key : ',k,'value : ',v)

print('============字符串>>>>>>>>>>>>>>>')
for ch in 'ABC':
	print(ch)

print('str是否可迭代:',isinstance('abc',Iterable))
print('list是否可迭代:',isinstance([1,2,3],Iterable))
print('整数是否可迭代:',isinstance(123,Iterable))

print('=================>>>>>>>>>>>>>>>>>>')
for i,value in enumerate(['A','B','C']):
	print(i,value)

print('=================>>>>>>>>>>>>>>>>>>')
for x,y in [(1,1),(2,4),(3,9)]:
	print(x,y)
