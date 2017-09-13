#!/usr/bin/python
# -*- coding: UTF-8 -*-

def person(name,age,**kw):
	print('name:',name,'age:',age,'other:',kw)

person('Michael',30)
print('=>>>>>>>>>>>>>>>>')
person('Bob',35,city='Beijing')
print('=====>>>>>>>>>>>>>')
person('Adam',45,gender='M',job='Engineer')
extra = {'city':'Beijing','job':'Engineer'}
print('======>>>>>>>>>>>>')
person('Jack',24,**extra)
