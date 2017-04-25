<?php 
	/**
	 *定义和用法
		 array_change_key_case() 函数将数组的所有的键都转换为大写字母或小写字母。
	 	数组的数字索引不发生变化。如果未提供可选参数（即第二个参数），则默认转换为小写字母。
		注释：如果在运行该函数时两个或多个键相同，则最后的元素会覆盖其他元素。
		语法：array_change_key_case(array,case);
		参数		描述
		array		必须。规定要使用的数组。
		case		可选。可能的值：
					CASE_LOWER	默认值。将数组的键转换为小写字母。
					CASE_UPPER	将数组的键转换为大写字母。
	 */
	
	$age=array("Bill"=>"60","Steve"=>"56","Mark"=>"31");

	print_r(array_change_key_case($age,CASE_UPPER));
	print_r(array_change_key_case($age,CASE_LOWER));

?>
