import java.util.Scanner;

class Divby7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();

		if (a%7==0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
	}
}