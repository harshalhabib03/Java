class Square{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {			//rows
			for (int j=1; j<=n; j++) {		//columns, j<=n means loop goes till 5
				System.out.print(j);
				//System.out.print("* ");
			}
			System.out.println();
		}
	}
}
// 1	
//		12
//	 	12
//			123
//			123
//				1234	
//				1234
//					12345
//					12345			

// 12345	
// 12345	
// 12345
// 12345
// 12345

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *