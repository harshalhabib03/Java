import java.util.Scanner;
class Digit3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int a = sc.nextInt();

		if (a>=100 && a<=999) {
			System.out.println("3 digit Number");
		}
		else {
			System.out.println("not a 3 digit Number");
		}
	}
}