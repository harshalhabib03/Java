abstract class Test{
	abstract void display();
	void show() 
	{
		System.out.println("1");
	}
}

class Ovrr_AbstractEx extends Test{

	void display(){

	}

	void show() 
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		Ovrr_AbstractEx a = new Ovrr_AbstractEx();
		a.show();
	}
}