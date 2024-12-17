class A{
	void showA(){
		System.out.println("a class method");
	}
}

class B extends A {

	void showB(){
		System.out.println("b class method");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.showA();
		//a.showB();		
		
		//showB method can't run because in single inheritance
		//child class can inherit parent properties
		//but, parent class can't inherit child properties

		B b = new B();
		b.showA();
		b.showB();
	}
}