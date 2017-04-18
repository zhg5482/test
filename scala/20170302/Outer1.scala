class Outer1 {
	class Inner {
		def f() { println("f") }
	class InnerMost {
		f() //ok
	}
	}
	(new Inner).f() //ok because now f() is public
}
