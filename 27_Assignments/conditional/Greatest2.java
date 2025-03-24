import java.util.Scanner;
class Greatest2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int a = sc.nextInt();

		System.out.println("Enter the 2nd num: ");
		int b = sc.nextInt();

		if (a>=b) {
			System.out.println("1st num is greater "+a);
		}
		else {
			System.out.println("2nd num is greater "+b);
		}
	}
}