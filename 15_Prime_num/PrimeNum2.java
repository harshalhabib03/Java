import java.util.Scanner;

class PrimeNum2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		int temp=0;

		for (int i=2; i<=n-1; i++) {
			if (n%i==0) {
				temp=temp+1;	
			}
		}
		if (temp>0) {
			System.out.println("not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}
}