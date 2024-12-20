class ThisEx{
	void display(){
		System.out.println("hello");
	}
	void show(){
		this.display();
	}
	public static void main(String[] args) {
		ThisEx e = new ThisEx();
		e.show();
	}
}