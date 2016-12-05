#!/usr/bin/python
# -*- coding: UTF-8 -*-

dict = {'Alice': '2341', 'Beth': '9102', 'Cecil': '3258'}
print "dict:",dict
print "dict['Beth']:",dict['Beth']
dict['message'] = '5623'
print "dict:",dict
dict['Alice']='1111'
print "dict:",dict
del dict['Cecil']
print "dict:",dict
dict.clear();     # 清空词典所有条目
del dict ;        # 删除词典
print "dict:",dict
