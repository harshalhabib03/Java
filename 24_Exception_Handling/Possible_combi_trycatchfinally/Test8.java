//error: 'try' without 'catch', 'finally' or resource declarations
// error: 'catch' without 'try'

//because we printed hello after try block so, it throws error

class Test8{
	public static void main(String[] args) {
		try{

		}
		System.out.println("hello");
		catch (Exception e) {
			
		}
	}
}