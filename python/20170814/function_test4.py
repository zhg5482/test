#!/usr/bin/python
# -*- coding: UTF-8 -*-

def enroll(name,gender,age=6, city='Beijing'):
	print('name:',name)
	print('gender:',gender)
	print('age:',age)
	print('city:',city)

enroll('zhg','class2')
print('\n')
enroll('Adam', 'M', city='Tianjin')

print("==========>>>>>>>>>>>")
def add_end(L=None):
	if L is None:
		L = []
	L.append('END')
	return L

print(add_end([1,2,3]))
print(add_end(['x','y','z']))
print(add_end())

print("===========>>>>>>>>>>>>")
def calc(*numbers):
	sum = 0
	for n in numbers:
		sum = sum + n * n
	return sum

print(calc(1,2,3))
print(calc(1,3,5,7))
print(calc())

print("===========>>>>>>>>>>>>>")
nums = [1,2,3]
print(calc(nums[0],nums[1],nums[2]))
print(calc(*nums))
