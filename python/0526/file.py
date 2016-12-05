#!/usr/bin/python
# -*- coding: UTF-8 -*-

fo = open("a.txt","wb")
fo.write( "www.runoob.com!\nVery good site!\n");

print "文件名: ", fo.name
print "是否已关闭 : ", fo.closed
print "访问模式 : ", fo.mode
print "末尾是否强制加空格 : ", fo.softspace

