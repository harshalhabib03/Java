import java.util.Scanner;

class RCal{
	public static void main(String[] args) {
		
		String yn;
		do{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first no. ");
			int no1 = s.nextInt();
			System.out.println("Enter second no. ");
			int no2 = s.nextInt();
			System.out.println("Select symbol(+,-,*,/)");
			String sym = s.next();
			int res;

			switch(sym){
				case "+": res=no1+no2;
							System.out.println("Addition is: " +res);
							break;
				case "-": res=no1-no2;
							System.out.println("Substraction is: " +res);
							break;
				case "*": res=no1*no2;
							System.out.println("Multiplication is: " +res);
							break;
				case "/": res=no1/no2;
							System.out.println("Division is: " +res);
							break;					
				default : System.out.println("Invalid symbol");
			}
			System.out.println("Do you want to continue(press y for Yes and n for No)");
			yn=s.next();
		}while(yn.equals("y") || yn.equals("Y"));
	}
}