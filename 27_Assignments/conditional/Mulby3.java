import java.util.Scanner;

class Mulby3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int a = sc.nextInt();

		if (a%3==0) {
			System.out.println("Multiplyed");
		}
		else {
			System.out.println("Not Multiplyed");
		}
	}
}