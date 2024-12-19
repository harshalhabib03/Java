class Test{
	void show(){
		System.out.println("1");
	}
}

class Ovrr_Sync_StrictfpM extends Test{
	synchronized void show(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.show();

		Ovrr_Sync_StrictfpM a = new Ovrr_Sync_StrictfpM();
		a.show();
	}
}