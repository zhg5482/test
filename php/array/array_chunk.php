<?php
	/**
	 * 定义和用法
	 * array_chunk() 函数把数组分割为新的数组块。
	 * 其中每个数组的单元数目由 size 参数决定。最后一个数组的单元数目可能会少几个。
	 * 可选参数 preserve_key 是一个布尔值，它指定新数组的元素是否有和原数组相同的键（用于关联数组），还是从 0 开始的新数字键（用于索		引数组）。默认是分配新的键。
	 * 语法：array_chunk(array,size,preserve_key);
	 * 	参数			描述
	 * 	array			必需。规定要使用的数组。
	 * 	size			必需。整数值，规定每个新数组包含多少个元素。
	 * 	preserve_key		可选。可能的值：
	 * 					true	保留原始数组中的键名。
	 * 					false	默认，每个结果数组使用从零开始的新数组索引。
	 */
	$cars=array("Volvo","BMW","Toyota","Honda","Mercedes","Opel");
	print_r(array_chunk($cars,2));
?>
