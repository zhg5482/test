#!/usr/bin/python
# -*- coding: UTF-8 -*-
import os

print(list(range(1,11)))

L = []
for x in range(1,11):
	L.append(x * x)

print(L)

print([x * x for x in range(1,11)])

print([x * x for x in range(1,11) if x % 2 == 0])

print([m + n for m in 'ABC' for n in 'XYZ'])

print('===============>>>>>>>>>>>>>>>>')
print([d for d in os.listdir('.')])

print('================>>>>>>>>>>>>>>>')
d = {'x':'A','y':'B','z':'c'}
for k,v in d.items():
	print(k,'=',v)

print('=================>>>>>>>>>>>>>>')
d2 = {'x':'A','y':'B','z':'C'}
print([k + '=' + v for k,v in d.items()])

print('=================>>>>>>>>>>>>>>')
L2 = ['Hello','World','IBM','Apple']
print([s.lower() for s in L2])
