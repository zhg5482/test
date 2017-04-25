package p {
	class Super{
		protected def f() { println("f") }
	}
	class Sub extends Super{
		f()
	}
	class Other { // 受保护的成员是从该成员定义的类的子类才能访问的
		(new Super).f() // Error: f is not accessible
	}
}
