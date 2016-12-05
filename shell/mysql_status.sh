#!/bin/bash
# MySQL 状态监测
#./mysqladmin -uroot ext |awk '/Queries/{print $4}'
cd /usr/local/mysql/bin/
./mysqladmin -uroot ext |awk '/Queries/{q=$4}/Threads_connected/{c=$4}/Threads_running/{r=$4}END {printf("%d %d %d\n",q,c,r)}'
