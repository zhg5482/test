<?php
	/**
 	 * array_diff_key() 只比较键名
	 * 定义和用法
	 * array_diff_key()函数用于比较两个(或更多个)数组的键名，并返回差集。
	 * 该函数比较两个(或更多个)数组的键名，并返回一个差集数组，该数组包括了所有在被比较的数组(array1)中，但是不在任何
	 * 其他参数数组(array2 或 array3 等等)中的键名。
	 * 说明：array_diff_key() 函数返回一个数组，该数组包括了所有在被比较的数组中，但是不在任何其他参数数组中的键。
	 *
	 * 语法：array_diff_key(array1,array2,array3...);
	 *
	 * 	参数			描述
	 * 	array1			必需。与其他数组进行比较的第一个数组。
	 * 	array2			必需。与第一个数组进行比较的数组。
	 * 	array3,...		可选。与第一个数组进行比较的其他数组。
	 *
	 * 返回值：返回数组，该数组包含所有在 array1中，但是不在任何其他参数数组(array2 或 array3 等等)中的键名。
	 */ 

	$a1	=	array("a"=>"red","b"=>"green","c"=>"blue");
	$a2	=	array("a"=>"red","c"=>"blue","d"=>"pink");

	$result	=	array_diff_key($a1,$a2);
	print_r($result);
?>
