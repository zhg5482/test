#!/usr/bin/python
# -*- coding: UTF-8 -*-
# 输入三个数 按从小到大输出
l = []
for i in range(3):
    x = int(raw_input('integer:\n'))
    l.append(x)
l.sort()
print l
