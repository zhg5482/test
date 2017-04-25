<?php
	/**
	 * 定义和用法
	 * array_count_values() 函数对数组中的所有值进行计数。
	 * 说明
	 * array_count_values() 函数用于统计数组中所有值出现的次数。
	 * 本函数返回一个数组，其元素的键名是原数组的值，键值是该值在原数组中出现的次数。
	 *
	 * 语法：array_count_values(array)
	 * 	参数			描述
	 * 	array			必需。规定需要对值进行计数的数组。
	 *
	 * 	返回值：返回关联数组，其元素的键名是原数组的值，键值是该值在原数组中出现的次数。
	 */

	$a	=	array("A","Cat","Dog","A","Dog");
	print_r(array_count_values($a));
?>
