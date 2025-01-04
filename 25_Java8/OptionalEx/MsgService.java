package OptionalEx;

import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter User Id: ");
		int userId = s.nextInt();
		
		User u = new User();
		String userName = u.getUsernameById(userId);
		
//		String msg = userName.toLowerCase();
		
		if (userName!=null) {
			String msg = userName.toUpperCase();
			System.out.println(msg);
		} else {
			System.out.println("Invalid id");
		}
		
		//System.out.println(msg);
		
	}

}
