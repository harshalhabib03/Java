class IncrTriangle{
	public static void main(String[] args) {
		
		int n=5;
		for (int i=1; i<=n; i++) {			//rows
			for (int j=1; j<=i; j++) {		//columns	j<=i means looping is as i
				System.out.print(j);
				//System.out.print("* ");
			}
			System.out.println();
		}
	}
}


// 1   		//i=1 1<=5 //j=1 1<=1 																		//1
// 12   	//i=2 2<=5 //j=1 1<=2 //1  //j=2 j<=2 //2  													//12
// 123   	//i=3 3<=5 //j=1 1<=3 //1  //j=2 j<=3 //2  //j=3 j<=3 //3 									//123   
// 1234  	//i=4 4<=5 //j=1 1<=4 //1  //j=2 j<=4 //2  //j=3 j<=4 //3  //j=4 j<=4 //4 					//1234			
// 12345	//i=5 5<=5 //j=1 1<=5 //1  //j=2 j<=5 //2  //j=3 j<=5 //3  //j=4 j<=5 //4  //j=5 j<=5 //5 	//12345			

// *
// * *
// * * *
// * * * *
// * * * * *