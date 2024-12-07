import java.util.Scanner;

class Armstrong2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int t1=n;
		int len=0;

		while (t1 != 0) {
			len=len+1;
			t1=t1/10;
		}

		int t2=n;
		int arm=0;
		int rem;

		while (t2 != 0) {
			int multi=1;
			rem=t2%10;

			for (int i=1; i<=len; i++) {
				multi=multi*rem;
			}
			arm=arm+multi;
			t2=t2/10;
		}
		if (arm == n) {
			System.out.println("Number is Armstrong Number");
		}
		else {
			System.out.println("Number is not Armstrong Number");
		}
	}
}