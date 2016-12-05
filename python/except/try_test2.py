#!/usr/bin/python
# -*- coding: UTF-8 -*-

# Define a function here.
def temp_convert(var):
   try:
      return int(var)
   except ValueError, Argument:
      print "The argument does not contain numbers\n", Argument

# Call above function here.

str = raw_input('pleaes enter a num:')
print temp_convert(str);

