<?php
	/**
 	 * array_diff_ukey() 只比较键名，使用用户自定义的键名比较函数
	 * 定义和用法
	 * array_diff_ukey() 函数用于比较两个(或多个)数组的键名，并返回差集。
	 * 注释：该函数使用用户自定义函数比较键名！
	 * 该函数比较两个(或更多个)数组的键名，并返回一个差集数组，该数组包括了所有在被比较的数组(array1)中,
	 * 但是不在任何其他参数数组(array2 或array3 等等)中的键名。
	 *
	 * 语法：array_diff_ukey(array1,array2,array3...,myfunction);
	 * 	参数			描述
	 * 	array1			必需。与其他数组进行比较的第一个数组。
	 * 	array2			必需。与第一个数组进行比较的数组。
	 * 	array3,...		可选。与第一个数组进行比较的其他数组。
	 * 	myfunction		必需。定义可调用比较函数的字符串。如果第一个参数小于，等于或大于第二个参数，
	 * 				则该比较函数必须返回小于，等于或大于 0 的整数。
	 * 说明：array_diff_ukey()返回一个数组，该数组包括了所有出现在array1中但是未出现在任何其他参数数组中的键名的
	 * 	 值。注意关联关系保留不变。与 array_diff() 不同的是，比较是根据键名而不是值来进行的。
	 * 	 次比较是通过用户提供的回调函数来进行的。如果认为第一个参数小于，等于，或大于第二个参数时必须分别返回
	 * 	 一个小于零，等于零，或大于零的整数。
	 * 返回值：返回差集数组，该数组包括了所有在被比较的数组(array1)中，但是不在任何其他参数数组(array2 或 array3 等等)
	 * 	   中的键名。
	 */ 

	function myfunction($a,$b)
	{
		if ($a===$b)
		 {
			return 0;
		 }
	  	return ($a>$b)?1:-1;
	}

	$a1	=	array("a"=>"red","b"=>"green","c"=>"blue");
	$a2	=	array("a"=>"blue","b"=>"black","e"=>"blue");

	$result	=	array_diff_ukey($a1,$a2,"myfunction");
	print_r($result);
?>
