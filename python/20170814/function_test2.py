#!/usr/bin/python
# -*- coding: UTF-8 -*-
import math

def quadratic(a,b,c):
	if not isinstance(a,(int,float)):
		raise TypeError('bad operand type')

	if not isinstance(b,(int,float)):
		raise TypeError('bad operand type')

	if not isinstance(c,(int,float)):
		raise TypeError('bad operand type')

	d = b*b-4*a*c
	if d > 0:
		return (-b+math.sqrt(d)) / (2*a),(-b-math.sqrt(d)) / (2*a)
	else:
		return "该方程无解"

print(quadratic(2, 3, 1))
print(quadratic(1, 3, -4))
