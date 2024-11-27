import java.util.Scanner;

class FactorialByRecursion2{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int fact;
		FactorialByRecursion2 f = new FactorialByRecursion2();
		fact=f.calcFact(n);
		System.out.println("Factorial of "+n+" is: " +fact);
	}

	int calcFact(int n){
		if(n>=1){
			return(n*calcFact(n-1));
		}		
		return 1;
	}
}