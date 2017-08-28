#!/usr/bin/python
# -*- coding: UTF-8 -*-
import math

def power(x):
	return x * x

print(power(5))
print(power(15))


def power1(x,n=2):
	s = 1
	while n > 0:
		n = n - 1
		s = s * x
	return s

print(power1(5,2))
print(power1(5,3))
