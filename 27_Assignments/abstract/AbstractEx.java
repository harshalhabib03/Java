abstract class Bank{
	public void Open_Acc(){
		System.out.println("Account Opened Successfully");
	}

	public abstract void withdraw();

	public void get_Bal(){
		System.out.println("Balance");
	}
}

class BOB extends Bank{
	
	public void withdraw(){
		System.out.println("withdraw");
	}

	public static void main(String[] args) {
		BOB obj = new BOB();
			obj.Open_Acc();
			obj.withdraw();
			obj.get_Bal();
	}
}

