#!/usr/bin/python
# -*- coding: UTF-8 -*-

def fact(n):
	if n==1:
		return 1
	return n * fact(n - 1)

print(fact(1))
print(fact(5))
print(fact(100))

def fact(n):
	return fact_iter(n,1)

def fact_iter(num,product):
	if num == 1:
		return product
	return fact_iter(num - 1,num * product)

print('=========>>>>>>>>>>>>')
print(fact_iter(5,1))
print(fact_iter(4, 5))
print(fact_iter(3, 20))
print(fact_iter(2, 60))
print(fact_iter(1, 120))
