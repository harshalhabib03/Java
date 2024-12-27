import java.util.Scanner;

class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg){
		super(msg);
	}
}
class Voting{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int age=s.nextInt();
		try{
			if (age<18) {
				//throw keyword is used inside the method
				throw new YoungerAgeException("You are not eligible for voting");
			}
			else{
				System.out.println("Your Voting Successed");
			}	
		}
		catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		
	}
}