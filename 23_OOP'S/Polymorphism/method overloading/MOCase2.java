class MOCase2{
	void show(Object a){
		System.out.println("Object method");
	}
	void show(String a){
		System.out.println("String method");
	}
	public static void main(String[] args) {
		MOCase2 m = new MOCase2();
		m.show("abc");	
		
		//object is parent class of all classes
		//but, abc is a String type and child is first precedence
		//when parent and child class are their in program
	}
}