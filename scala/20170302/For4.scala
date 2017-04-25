object For4{
	def main(args: Array[String]){
		var a = 0;
		//for循环使用集合
		val numList = List(1,2,3,4,5,6);
		//for loop execution with a collection
		for( a <- numList){
			println("Value of a:" + a );
		}
	}
}
