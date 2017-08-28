#!/usr/bin/python
# -*- coding: UTF-8 -*-
import math

def my_abs(x):
	if not isinstance(x,(int,float)):
		raise TypeError('bad operand type')
	if x >= 0:
		return x
	else:
		return -x


def nop():
	pass


def move(x,y,step,angle=0):
	nx = x + step * math.cos(angle)
	ny = y - step * math.sin(angle)
	return nx,ny


print(my_abs(-3))
print(nop())
x, y = move(100, 100, 60, math.pi / 6)
print("x,y : ",x,y)
r = move(100, 100, 60, math.pi / 6)
print("r : ",r)
