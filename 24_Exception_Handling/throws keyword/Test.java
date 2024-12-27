import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class ReadAndWrite{
	
	//throws keyword is used with method class
	void ReadFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("e:/abx.txt");
	}

	void SaveFile() throws FileNotFoundException
	{
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("e:/xyz.txt");
	}
}

class Test{

	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		// try{
		// 	rw.ReadFile();	
		// }
		// catch (FileNotFoundException e) {
		// 	e.printStackTrace();
		// 	System.out.println("hello");
		// }

		try{
			rw.SaveFile();
			System.out.println("File Saved Successfully");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("hello");
		}
	}
}