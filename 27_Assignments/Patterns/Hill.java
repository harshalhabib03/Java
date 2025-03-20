class Hill{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
   
// 	       *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *

//	 1
//		1		
//    112	
//            1
//          112
//        12123
// 					1
//				  112
//				12123
//			  1231234
//						1
//					  112
//					12123
//				  1231234
//				 12312345
