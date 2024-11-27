import java.util.Scanner;

class Factorial{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number you want its factorial");
		int n=s.nextInt(); 
		int fact =1;

		for(int i=1; i<=n; i++){
			fact=fact*i;
		}

		// for(int i=n; i>=1; i--){
		// 	fact=fact*i;
		// }
		System.out.println("Factorial of "+n+" is: "+fact);
	}
}