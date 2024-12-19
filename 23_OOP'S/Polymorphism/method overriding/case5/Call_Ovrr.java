class Test{
	void show(){
		System.out.println("1");
	}
}
class Call_Ovrr extends Test{
	void show(){
		super.show();
		System.out.println("2");
	}
	public static void main(String[] args) {
		
		Call_Ovrr x = new Call_Ovrr();
		x.show();	//2
	}
}