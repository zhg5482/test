import scala.util.control._

object Break1{
	def main(args: Array[String]){
		var a = 0;
		var numList = List(1,2,3,4,5,6,7,8,9,10);
		
		var loop = new Breaks;
		loop.breakable{
			for( a <- numList){
				println("Value of a: " + a );
				if( a == 4 ){
					loop.break;
				}
			}
		}
		println("After the loop");
	}
}
