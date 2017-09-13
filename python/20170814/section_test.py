#!/usr/bin/python
# -*- coding: UTF-8 -*-

L = ['Michael','Sarah','Tracy','Bob','Jack']
print(L)

print(L[1:3])
print(L[-2:-1])

print('==========>>>>>>>>>>>>>')
L2 = list(range(100))
print(L2)

print('前十个:',L2[:10])
print('后十个:',L2[-10:])
print('前11-20个数:',L2[10:20])
print('前10个数,每两个取一个:',L2[:10:2])
print('所有数,每5个取一个:',L2[::5])

print('=============>>>>>>>>>>>>')
print('tuple:',(0,1,2,3,4,5)[:3])
print('==============>>>>>>>>>>>')
print('字符串:','ABCDEFG'[:3])
print('字符串:','ABCDEFG'[::2])
