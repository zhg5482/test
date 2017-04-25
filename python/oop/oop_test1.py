#!/usr/bin/python
# -*- coding: UTF-8 -*-
class Employee:
	empCount = 0
	def __init__(self,name,salary):
		self.name = name
		self.salary = salary
		Employee.empCount +=1

	def displayCount(self):
		print "Total Employee %d" % Employee.empCount

   	def displayEmployee(self):
      		print "Name : ", self.name,  ", Salary: ", self.salary


em1 =  Employee('zhg','1111')
em1.displayCount()
em1.displayEmployee()

print hasattr(em1,'name')
print setattr(em1,'age',19)
print getattr(em1,'age')
print delattr(em1,'age')
