package ScannerEx;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		int i = s.nextInt();
		System.out.println("Enter 2nd num: ");
		int j = s.nextInt();
		int result=i+j;
		System.out.println("Result: "+result);
	}
}
