import java.util.Scanner;

class ReverseString2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Character to reverse");
		String name = s.next();
		int len = name.length();
		String rev = "";

		for (int i=len-1; i>=0; i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}