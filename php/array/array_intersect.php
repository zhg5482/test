<?php
	/**
	 * array_intersect() 函数 只比较键值
	 * 定义和用法
	 * array_intersect() 函数用于比较两个(或更多个)数组的键值，并返回交集。
	 * 该函数比较两个(或更多个)数组的键值，并返回交集数组，该数组包括了所有在被比较的数组(array1)中,
	 * 同时也在任何其他参数数组(array2 或 array3等等)中的键值。
	 * 说明：array_intersect() 函数返回两个或多个数组的交集数组。
	 * 	 结果数组包含了所有在被比较数组中，也同时出现在所有其他参数数组中的值，键名保留不变。
	 * 注释：仅有值用于比较。
	 *
	 * 语法：array_intersect(array1,array2,array3...);
	 * 	参数			描述
	 * 	array1			必需。与其他数组进行比较的第一个数组。
	 * 	array2			必需。与第一个数组进行比较的数组。
	 * 	array3,...		可选。与第一个数组进行比较的其他数组。
	 * 返回值：返回交集数组，该数组包括了所有在被比较的数组(array1)中，同时也在任何其他参数数组
	 * 	   (array2 或 array3等等)中的键值。
	 */ 

	$a1	=	array("a"=>"red","b"=>"green","c"=>"blue","d"=>"yellow");
	$a2	=	array("e"=>"red","f"=>"black","g"=>"purple");
	$a3	=	array("a"=>"red","b"=>"black","h"=>"yellow");

	$result	=	array_intersect($a1,$a2,$a3);
	print_r($result);	
?>
