interface I1{
	void display1();
}

abstract class Test1{
	abstract void display();
	void show() 
	{
		System.out.println("1");
	}
}

class Ovrr_InterfaceEX extends Test1{

	public void display1(){

	}

	void show() 
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		Ovrr_InterfaceEX a = new Ovrr_InterfaceEX();
		a.show();
	}
}