import java.util.Scanner;
class Ascending3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num: ");
		int x = sc.nextInt();

		System.out.println("Enter the 2nd num: ");
		int y = sc.nextInt();

		System.out.println("Enter the 3rd num: ");
		int z = sc.nextInt();

		if (x>y && x>z) {
			if (x>y) {
				System.out.println(x+","+y+","+z);	
			}
			else{
				System.out.println(x+","+z+","+y);
			}
		}

		else if (y>x && y>z) {
			if (x>z) {
				System.out.println(y+","+x+","+z);
			}
			else {
				System.out.println(y+","+z+","+x);
			}
		}

		else if (z>x && z>y) {
			if (x>y) {
				System.out.println(z+","+x+","+y);
			}
			else {
				System.out.println(z+","+y+","+x);
			}
		}
	}
}