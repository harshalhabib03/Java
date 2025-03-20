class HillRev{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
					System.out.print("  ");
			}
			for (int j=i; j<n; j++) {
				System.out.print(j);
			}
			for (int j=i; j<=n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

//	1
//	 112
//	   1
//		12123	
//		  223
//			3
//			 1231234		
//	    	   23234
//				 334
//				   4
//					123412345
//					  2342345
//						34345
//						  445
//							5