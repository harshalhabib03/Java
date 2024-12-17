class A{
	void showA(){
		System.out.println("a class method");
	}
}

class B extends A {

	void showB(){
		System.out.println("b class method");
	}
}

class C extends A {

	void showC(){
		System.out.println("c class method");
	}

		public static void main(String[] args) {
		
		A a = new A();
		a.showA();
		//a.showB();		
		//a.showC();
		
		System.out.println("-----------------------");
	
		B b = new B();
		b.showA();
		b.showB();
		//b.showC();

		System.out.println("-----------------------");
		
		C c = new C();
		c.showA();
		//c.showB();
		c.showC();
	}

}