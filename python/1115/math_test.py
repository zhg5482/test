#!/usr/bin/python
# -*- coding: UTF-8 -*-
# 功能:算式与代数式运算

import math           #导入math模块

x = 2                 #创建变量并赋值
print(math.sin(x))    #求正弦值

print(math.hypot(3,4))  #求 3，4 为直角边的三角形斜边长

print(math.sqrt(x))     #求平方根

print(math.asin(math.sqrt(2)/2))  #嵌套调用，求2的平方根除以2的反正弦值

print(math.pow(2,16))   #求2的16次方

