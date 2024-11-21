class NestedIf{
	public static void main(String[] args) {
		int a = 8;
		if(a == 8){
			if(a <= 5){
				System.out.println("Really greater");
			}
			else{
				System.out.println("not");
			}
		}
		else{
			System.out.println("no");
		}
	}
}