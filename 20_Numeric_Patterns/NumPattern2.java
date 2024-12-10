class NumPattern2{
	public static void main(String[] args) {
		
		int count=0;
		for (int i=1; i<=5; i++) {	//rows
			for (int j=1; j<=i; j++) {	//columns
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}