<?php
	/**
	 * array_flip() 函数
	 * 定义和用法
	 * array_flip() 函数用于反转/交换数组中所有的键名以及它们关联的键值。
	 * array_flip() 函数返回一个反转后的数组，如果同一值出现了多次，则最后一个键名将
	 * 作为它的值，所有其他的键名都将丢失。
	 * 如果原数组中的值的数据类型不是字符串或整数，函数将报错。
	 *
	 * 语法：array_flip(array);
	 * 	参数		描述
	 * 	array		必需。规定需要进行键/值对反转的数组。
	 * 返回值：如果反转成功，则返回反转后的数组。如果失败，则返回null。
	 */ 

	$a1	=	array("a"=>"red","b"=>"green","c"=>"blue","d"=>"yellow");
	$result	=	array_flip($a1);
	print_r($result);
?>
