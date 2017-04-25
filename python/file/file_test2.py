#!/usr/bin/python
# -*- coding: UTF-8 -*-
# read file
fo = open("a.txt", "r+")
str = fo.read(5)
print str
fo.close()

