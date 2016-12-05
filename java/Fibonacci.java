import java.util.*;
class Fibonacci{
	public static void main(String agrs[]){
		Fibonacci t1 = new Fibonacci();
		System.out.print("please enter a num:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(t1.fib(n));
	}

	public int fib( int n){
	//	System.out.println(n);
		if(n==1 || n==2){
			return 1;
		}

		return fib(n-1)+fib(n-2);
	}
}
