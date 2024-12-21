class Static1{
	void display(){								//for instance method we create object to call
		System.out.println("1");
	}
	static void show(){							//for static method we can call directly
		System.out.println("2");
	}
	public static void main(String[] args) {
		Static1 t = new Static1();
		t.display();	//1
		show();			//2		//directly
		Static1.show();	//2		//through class name
		Test.show1();	//3		//through class name we can call but directly we can't call it
	}
}

class Test{
	static void show1(){
		System.out.println("3");
	}
}