#!/usr/bin/python
# -*- coding: UTF-8 -*-

L = [x * x for x in range(10)]
print(L)

print('===============>>>>>>>>>>>>>>>')
g = (x * x for x in range(10))
print(g)
print(next(g))
print(next(g))

print('================>>>>>>>>>>>>>>')
for n in g:
	print(n)

print('================Fibonacci>>>>>>>>>>>>>>')
def fib(max):
	n,a,b = 0,0,1
	while n < max:
		print(b)
		a,b = b,a + b
		n = n + 1
	return 'done'

fib(6)
