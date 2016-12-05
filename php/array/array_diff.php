<?php
	/**
 	 * array_diff() 只比较键值
	 * 定义和用法
	 * array_diff() 函数返回两个数组的差集数组。该数组包括了所有在被比较的数组中，但是不在任何其他参数数组中的键值。
	 * 在返回的数组中，键名保持不变。
	 *  
	 * 语法：array_diff(array1,array2,array3 ...)
	 * 	参数			描述
	 * 	array1			必需。与其他数组进行比较的第一个数组。
	 * 	array2			必需。与第一个数组进行比较的数组。
	 * 	array3			可选。与第一个数组进行比较的其他数组。
	 * 提示：可用一个或任意多个数组与第一个数组进行比较。
	 * 返回值：返回差集数组，该数组包括了所有在被比较的数组(array1)中,但是不在任何其他参数数组(array2 或 array3等等) 中的键值。
	 */
	
	$a1	=	array("a"=>"red","b"=>"green","c"=>"blue","d"=>"yellow");
	$a2	=	array("e"=>"red","f"=>"black","g"=>"purple");
	$a3	=	array("a"=>"red","b"=>"black","h"=>"yellow");

	$result	=	array_diff($a1,$a2,$a3);
	print_r($result);
?>
