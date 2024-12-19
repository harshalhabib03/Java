class MOCase3{
	
	void show(StringBuffer a){
		System.out.println("StringBuffer method");
	}
	void show(String a){
		System.out.println("String method");
	}
	public static void main(String[] args) {
		MOCase3 m = new MOCase3();
		m.show("abc");	
		m.show(new StringBuffer("xyz"));
		//m.show(null);	
	}
}