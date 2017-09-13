#!/usr/bin/python
# -*- coding: UTF-8 -*-

print('=============== list 删掉偶数,保留奇数 >>>>>>>>>>>>>>>>')
def is_odd(n):
	return n % 2 == 1

print(list(filter(is_odd,[1,2,4,5,6,9,10,15])))

print('=============== 删除空串 >>>>>>>>>>>>>>>>')
def not_empty(s):
	return s and s.strip()

print(list(filter(not_empty,['A','','B',None,'C',' '])))

print('================ filter 求素数 >>>>>>>>>>>>>>>>>>')
def _odd_iter():
	n = 1
	while True:
		n = n + 2
		yield n

def _not_divisible(n):
	return lambda x: x % n > 0

def primes():
	yield 2
	it = _odd_iter() # 初始序列
	while True:
		n = next(it) # 返回序列的第一个数
		yield n
		it = filter(_not_divisible(n),it) # 构造新序列

print('========== 打印1000以内的素数 >>>>>>>>>>>>')
for n in primes():
	if n < 1000:
		print(n)
	else:
		break
