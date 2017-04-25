<?php 
	/**
	 * 定义和用法
	 * array_fill() 函数用键值填充数组。
	 * 说明：array_fill() 函数用给定的值填充数组，返回的数组有number个元素，值为 value。返回的数组使用数字索引，从
	 * 	 start位置开始并递增。如果 number 为 0 或小于 0，就会出错。
	 * 语法：array_fill(index,number,value);
	 * 	参数		描述
	 * 	index		必需。被返回数组的第一个索引。
	 * 	number		必需。规定要插入的元素数。
	 * 	value		必需。规定供填充数组所使用的值。
	 * 返回值：返回被填充的数组。
	 */ 

	$a1	=	array_fill(3,4,"blue");
	print_r($a1);
?>
