import java.util.Scanner;
class Greatest3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int a = sc.nextInt();

		System.out.println("Enter the 2nd num: ");
		int b = sc.nextInt();

		System.out.println("Enter the 3rd num: ");
		int c = sc.nextInt();

		if (a>=b && a>=c) {
			System.out.println("1st num is greatest "+a);
		}
		else if (b>=a && b>=c) {
			System.out.println("2nd num is greatest "+b);
		}
		else {
			System.out.println("3rd num is greatest "+c);
		}
	}
}