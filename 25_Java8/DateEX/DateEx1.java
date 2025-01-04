package DateEX;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) throws Exception {
		
		Date d = new Date();
		System.out.println(d);	//Fri Dec 06 17:09:18 IST 2024
		
		//Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");	
		String format1 = sdf1.format(d);	//06/12/2024
		System.out.println(format1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");	
		String format2 = sdf2.format(d);	//12/06/2024
		System.out.println(format2);
		
		//Converting String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");	
		Date parsedDate = sdf3.parse("2024-12-20");	//06/12/2024
		System.out.println(parsedDate);
	}

}
