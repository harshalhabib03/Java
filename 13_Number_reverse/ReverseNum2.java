import java.util.Scanner;

class ReverseNum2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number you want to reverse");
		int n=s.nextInt(); 
		int rem, rev=0;

		while(n != 0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}