class DecrTriangle{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {				//rows
			for (int j=i; j<=n; j++) {			//columns	here j=i
					System.out.print(j);
					//System.out.print("* ");		//prints row wise 
				}	
			System.out.println();				//to print in next line
		}
	}
}

//1
//	12
//	1
//		123
//		23
//		3
//			1234
//			234	
//			34
//			4
//				12345
//				2345
//				345
//				45
//				5

// 1 2 3 4 5
// 2 3 4 5
// 2 4 5
// 4 5
// 5


// * * * * *
// * * * *
// * * *
// * *
// *