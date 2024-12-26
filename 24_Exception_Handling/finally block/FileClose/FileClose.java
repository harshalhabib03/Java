import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileClose{
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("e:abc.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		finally{
			//cleanup code
			if(fis!=null){
				fis.close();
			}
			System.out.println("File Closed");
		}
	}
}