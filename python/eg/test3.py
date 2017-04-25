#!/usr/bin/python
# -*- coding: UTF-8 -*-
#输出10000以内 ＋100 和 ＋268 后 还是 完全平方数的数

import math
for i in range(10000):
    #转化为整型值
    x = int(math.sqrt(i + 100))
    y = int(math.sqrt(i + 268))
    if(x * x == i + 100) and (y * y == i + 268):
        print i
