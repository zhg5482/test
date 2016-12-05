<?php
	/**
	 *定义和语法
	  array_fill_keys() 函数使用指定的键和值填充数组

	  语法：array_fill_keys(keys,value);
		参数		描述
	 	keys		必需。使用该数组的值作为键。非法值将被转换为字符串。
		value		必需。填充数组所使用的值。
	  返回值：返回被填充的数组。
	 */
	
	$keys	=	array("a","b","c","d");
	$a1	=	array_fill_keys($keys,"blue");
	print_r($a1);
?>
