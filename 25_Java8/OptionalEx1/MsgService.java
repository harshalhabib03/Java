package OptionalEx1;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter User Id: ");
		int userId = s.nextInt();
		
		User u = new User();
		
		Optional<String> username = u.getUsername(userId);
		
		if (username.isPresent()) {
			String name = username.get();
			System.out.println("Hi, "+name.toUpperCase());
		} else {
			System.out.println("Username Not Found");
		}
	}

}
