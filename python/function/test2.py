#!/usr/bin/python
# -*- coding: UTF-8 -*-
def changeme(mylist):
	mylist.append([1,2,3,4])
	print "函数内输出:",mylist
	return

mylist = [10,20,30]
print "函数外输出:",mylist
changeme(mylist)
