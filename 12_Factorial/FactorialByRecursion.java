import java.util.Scanner;

class FactorialByRecursion{
	
	static int fact=1;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		FactorialByRecursion f = new FactorialByRecursion();
		f.calcFact(n);
		System.out.println("Factorial of "+n+" is: " +fact);
	}

	void calcFact(int n){
		if(n>=1){
			fact=fact*n;
			calcFact(n-1);
		}		
	}
}