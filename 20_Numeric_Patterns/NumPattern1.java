class NumPattern1{
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {		//rows
			for (int j=1; j<=i; j++) {	//columns
				System.out.print(j);
			}
			System.out.println();
		}

		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}