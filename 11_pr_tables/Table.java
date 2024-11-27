import java.util.Scanner;

class Table{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number you want to print table");
		int t = s.nextInt();

		for (int i=1; i<=10; i++) {
			
			//System.out.println(t*i);	//simple prints 2 4 6 8 10 12 14 16 18 20

			System.out.println(t + " x " + i + " = " + t*i); //proper prints 2 x 1 = 2
		}
	}
}