import scala.util.control._

object Break2{
	def main(args: Array[String]){
		var a = 0;
		var b = 0;
		val numList1 = List(1,2,3,4,5);
		val numList2 = List(11,12,13);

		val outer = new Breaks;
		val inner = new Breaks;

		outer.breakable{
			for( a <- numList1 ){
				println("Value of a: " + a );
				inner.breakable{
					for( b <- numList2 ){
						println("Value of b: " + b );
						if( b == 12){
							inner.break;
						}
					}
				}// inner breakable
			}
		}//outer breakable
	}
}
