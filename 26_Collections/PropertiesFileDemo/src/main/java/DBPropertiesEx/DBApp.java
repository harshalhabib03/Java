package DBPropertiesEx;

import java.io.FileInputStream;
import java.util.Properties;

public class DBApp {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("database.properties");
		
		Properties p = new Properties();
		p.load(fis); 
		
		String uname = p.getProperty("uname"); 
		String pwd = p.getProperty("pwd");
		
		System.out.println("Username: "+uname);
		System.out.println("Password: "+pwd);
		
		fis.close();
	}

}
