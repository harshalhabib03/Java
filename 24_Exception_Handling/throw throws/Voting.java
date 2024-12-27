class UnderAgeException extends Exception{
	UnderAgeException(){
		super("you are under age");
	}
	UnderAgeException(String msg){
		super(msg);
	}
}
class Voting{
	public static void main(String[] args) {
		
		int age=19;
		try{
			if (age<18) {
				throw new UnderAgeException("You are not eligible to vote");
			}
			else {
				System.out.println("you can vote...");
			}	
		}
		catch (UnderAgeException uae) {
			uae.printStackTrace();
		}
		
	}
}