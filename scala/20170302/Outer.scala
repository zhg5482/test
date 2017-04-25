class Outer{
	class Inner{
		private def f() { println("f") }
		class InnerMost{
			f() //ok
		}
	}
	//私有成员只能看到里面包含的成员定义的类或对象
	(new Inner).f() //Error:f is not accessible
}

