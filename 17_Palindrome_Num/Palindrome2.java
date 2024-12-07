import java.util.Scanner;

class Palindrome2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome");
		int n=s.nextInt();
		int temp=n;
		int rev=0, rem;

		while (temp != 0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}

		if (n==rev) {
			System.out.println(n+ " is Palindrome Number");
		}
		else {
			System.out.println(n+" is not a Palindrome Number");
		}
	}
}