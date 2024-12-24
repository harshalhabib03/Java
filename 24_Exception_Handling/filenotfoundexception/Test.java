import java.io.FileInputStream;

class Test{
	public static void main(String[] args) {
		
		//checked exception by compiler
		//FileInputStream fis = new FileInputStream("e:/abc.txt");


		//Unchecked exception by compiler, checked at runtime

		// try{
		// 	FileInputStream fis = new FileInputStream("e:/abc.txt");		
		// }
		// catch (Exception e) {
		// 	System.out.println(e);	//java.io.FileNotFoundException:
		// }


		//Unchecked exception by compiler, checked at runtime
		int a=100, b=0, c;			
		c=a/b;	
		System.out.println(c);		//ArithmeticException

		String name = null;
		System.out.println(name.length());		//NullPointerException
	}
}