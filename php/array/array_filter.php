<?php
	/**
	 * 定义和用法
	 * array_filter() 函数用回调函数过滤数组中的值
	 * 该函数把输入数组中的每个键值传给回调函数。如果回调函数返回true，则把输入数组中的当前键值返回
	 * 结果数组中。数组键名保持不变。
	 *
	 * 语法：array_filter(array,callbackfunction);
	 * 	参数			描述
	 * 	array			必需。规定要过滤的数组。
	 * 	callbackfunction	必需。规定要使用的回调函数。
	 * 返回值：返回过滤的数组。
	 */ 
	
	function test_odd($var){
		return($var & 1);
	}
	
	$a1 = array("a","b",2,3,4);
	print_r(array_filter($a1,"test_odd"));
?>
