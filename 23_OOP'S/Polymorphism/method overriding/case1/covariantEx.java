class Test{
	Object show(){
		System.out.println("1");
		return null;
	}
}
class covariantEx extends Test {
	String show(){
		System.out.println("2");
		return null;
	}
	public static void main(String[] args) {
		Test t =new Test();
		t.show();
		covariantEx c = new covariantEx();
		c.show();
	}
}