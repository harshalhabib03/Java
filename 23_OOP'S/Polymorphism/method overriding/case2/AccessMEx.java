class Test{
	protected Object show(){
		System.out.println("1");
		return null;
	}
}
class AccessMEx extends Test {
	public String show(){
		System.out.println("2");
		return null;
	}
	public static void main(String[] args) {
		Test t =new Test();
		t.show();
		AccessMEx a = new AccessMEx();
		a.show();
	}
}