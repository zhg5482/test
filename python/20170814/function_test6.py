#!/usr/bin/python
# -*- coding: UTF-8 -*-

def person(name,age,**kw):
	if 'city' in kw:
		pass
	if 'job' in kw:
		pass
	print('name:',name,'age:',age,'other:',kw)

person('Jack',24,city='Berjing',addr='Chaoyang',zipcode=123456)

print('==========>>>>>>>>')

def person1(name,age,*,city,job):
	print(name,age,city,job)

person1('Jack',24,city='Beijing',job='Engineer')

print('==========>>>>>>>>>')

def person2(name,age,*args,city,job):
	print(name,age,args,city,job)

#person2('Jack',24,'Beijing','Engineer')

def person3(name,age,*,city='Beijing',job):
	print(name,age,city,job)

person3('Jack',24,job='Engineer')
print('============>>>>>>>>>>>>>>')

def f1(a,b,c=0,*args,**kw):
	print('a =',a,'b =',b,'c =',c,'args =',args,'kw =',kw)

def f2(a,b,c=0,*,d,**kw):
	print('a =',a,'b =',b,'c =',c,'d =',d,'kw =',kw)

f1(1,2)
f1(1,2,c=3)
f1(1, 2, 3, 'a', 'b')
f1(1, 2, 3, 'a', 'b', x=99)
f2(1, 2, d=99, ext=None)

print('==============>>>>>>>>>>>>')
args = (1,2,3,4)
kw = {'d':99,'x':'#'}
f1(*args,**kw)

print('================>>>>>>>>>>>>')
args = (1,2,3)
kw = {'d':88,'x':'#'}
f2(*args,**kw)
