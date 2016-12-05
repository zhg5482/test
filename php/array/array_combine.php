<?php 
	/**
	 * 定义和用法
	 * array_combine() 函数通过合并两个数组来创建一个新数组，其中的一个数组是键名，另一个数组的值为键值。
	 * 注释：键名数组和键值数组的元素个数必须相同！
	 * 如果其中一个数组为空，或者两个数组的元素个数不同，则该函数返回 false。
	 *
	 * 语法：array_combine(keys,values);
	 * 	参数			描述
	 * 	keys			必需。键名数组。
	 * 	values			必需。键名数组。
	 * 	
	 * 	返回值：返回合并后的数组。如果两个数组的元素个数不匹配，则返回 FALSE。
	 */

	 $fname	=	array("Bill","Steve","Mark");
	 $age	=	array("60","56","31");

	 $c	=	array_combine($fname,$age);
	 print_r($c);
?>
