<?php 
	/**
	 * array_diff_uassoc() 比较键名和键值 使用用户自定义的键名比较函数
	 * 定义和用法
	 * array_diff_uassoc() 函数用于比较两个(或更多个)数组的键名和键值，并返回差集。
	 * 注释：该函数使用用户自定义函数来比较键名！
	 * 该函数比较两个(或更多个)数组的键名和键值,并返回一个差集数组，该数组包括了所有在被比较的数组(array1)中，但是不在
	 * 任何其他参数数组(array2 或 array3 等等)中的键名和键值。
	 *
	 * 语法：array_diff_uassoc(array1,array2,array3...,myfunction);
	 * 	参数			描述
	 * 	array1			必需。与其他数组进行比较的第一个数组。
	 * 	array2			必需。与第一个数组进行比较的数组。
	 * 	array3,...		可选。与第一个数组进行比较的其他数组。
	 * 	myfunction		必需。定义可调用比较函数的字符串。如果第一个参数小于，等于或大于第二个参数，则该比
	 * 				      较函数必须返回小于，等于或大于 0 的整数。
	 *说明：array_diff_uassoc() 函数使用用户自定义的毁掉函数(callback)做索引检查来计算两个或多个数组的差集。返回一个数组，
	 	该数组包括了在 array1 中但是不在任何其他参数数组中的值。
		注意 与array_diff() 函数不同的是，键名也要进行比较。
		参数 myfunction 是用户自定义的用来比较连个数组的函数，该函数必须带有两个参数 - 即两个要进行对比的键名。因此与
		函数array_diff_assoc(）的行为正好相反，后者是用内部函数进行比较的。
		返回的数组中键名保持不变。
	  返回值：返回差集数组，该数组包括了所有在被比较的数组(array1)中，但是不在任何其他参数数组(array2 或 array3 等等)中的
	  	  键名和键值。
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
	$a2	=	array("d"=>"red","b"=>"green","e"=>"blue");

	$result	=	array_diff_uassoc($a1,$a2,"myfunction");
	print_r($result);
?>
