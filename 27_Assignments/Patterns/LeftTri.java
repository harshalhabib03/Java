class LeftTri{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
					System.out.print("  ");
			}	
			for (int j=i; j<=n; j++) {
				//System.out.print("* ");
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

// 1                                   12345
// 	12                                  2345
//	  2                                  345
//		123                               45
//		  23                               5
//			3
//			1234
//		  	  234
//			    34
//				  4		
//					12345
//					  2345
//						345
//						  45
//							5

// * * * * *
//   * * * *
//     * * *
//       * *
//         *