#!/usr/bin/python
# -*- coding: UTF-8 -*-
# 功能:生成六位随机数字字母组成的串

import string,random       #引入相关标准库

capta = ''
words = ''.join((string.ascii_letters,string.digits))   #生成大小写字母和数字串
for i in range(6):
	capta += random.choice(words)  #随机选择一个字母或数字
print(capta)   #打印生成的验证码字符串

