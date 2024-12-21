class Static1{
	
	//int i=10;				//we can't access instance data
	static int i=10;
	static void display(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		display();
	}
}