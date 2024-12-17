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

class C extends B {

	void showC(){
		System.out.println("c class method");
	}

		public static void main(String[] args) {
		
		A a = new A();
		a.showA();
		//a.showB();		
		//a.showC();
		System.out.println("-----------------------");
		//showB & showC method can't run because in multilevel inheritance
		//child class can inherit parent & grandparent properties
		//parent class can't inherit child properties 
		//but, parent & child class can inherit
		
		B b = new B();
		b.showA();
		b.showB();
		//b.showC();

		System.out.println("-----------------------");
		
		C c = new C();
		c.showA();
		c.showB();
		c.showC();
	}

}