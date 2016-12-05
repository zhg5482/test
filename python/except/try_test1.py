#!/usr/bin/python
# -*- coding: UTF-8 -*-
try:
	f = open('a.txt')
	f.write('this is a file!')
except IOError:
	print 'can\'t open file or read file!'
else:
	print 'file write success!'
