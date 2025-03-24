import java.util.Scanner;
class Largest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int x = sc.nextInt();

		System.out.println("Enter the 2nd num: ");
		int y = sc.nextInt();

		System.out.println("Enter the 3rd num: ");
		int z = sc.nextInt();

		if (x>=y && x>=z) {
			System.out.println("1st num is largest "+x);
		}
		else if (y>=x && y>=z) {
		 	System.out.println("2nd num is largest "+y);
		} 
		else {
			System.out.println("3rd num is largest "+z);
		}
	}
}