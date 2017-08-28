#!/usr/bin/python
# -*- coding: UTF-8 -*-

classmates = ['Michael','Bob','Tracy']
#打印classmates
print('classmates = ',classmates)
#打印classmates 长度
print('len = ',len(classmates))

#list尾部追加元素
classmates.append('Adam')
print('classmates = ',classmates)

#list指定位置插入元素
classmates.insert(2,'Jack')
print('classmates = ',classmates)

#list删除末尾元素
classmates.pop()
print('classmates = ',classmates)

#list删除指定位置元素
classmates.pop(1)
print('classmates = ',classmates)

