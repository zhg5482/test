#!/usr/bin/python
# -*- coding: UTF-8 -*-

n = 0
while n < 10:
	n = n + 1
	print(n)

n = 0
while n < 10:
	n = n + 1
	if n % 2 == 0:
		continue
	print(n)
