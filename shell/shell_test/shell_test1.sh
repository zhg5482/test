#!/bin/bash
#使用 read 命令从 stdin 获取输入并赋值给 PERSON 变量，最后在 stdout 上输出

echo $$
echo "What is your name?"
read PERSON
echo "Hello,$PERSON"
