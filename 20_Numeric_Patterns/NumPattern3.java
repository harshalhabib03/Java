class NumPattern3{
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {		//rows
			for (int j=i; j>=1; j--) {	//columns
				System.out.print(j);
			}
			System.out.println();
		}
	}
}