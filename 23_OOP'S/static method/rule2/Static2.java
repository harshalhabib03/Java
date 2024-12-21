class Static2 {
	static void display(){
		System.out.println("1");
		show();
	}
	static void show(){
		System.out.println("2");
	}
	public static void main(String[] args) {
		display();
	}
}