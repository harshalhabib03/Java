package OptionalEx;

public class User {
	
	public String getUsernameById(Integer id) {
		if(id == 100) {
			return "Rahul";
		}
		else if (id == 101) {
			return "Sonia";
		}
		else if (id == 102) {
			return "Priya";
		}
		else {
			return null;
		}
	}
}
