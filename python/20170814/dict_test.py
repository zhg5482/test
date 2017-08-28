#!/usr/bin/python
# -*- coding: UTF-8 -*-

d = {'Michael':95,'Bob':75,'Bob':75,'Tracy':85}
print(d)

d['Adam'] = 67
print(d)

d['Jack'] = 90
print(d['Jack'])

print(d.get('Thomas'))

d.pop('Adam')
print(d)
