package OptionalEx1;

import java.util.Optional;

public class User {
	//with optional object
	public Optional<String> getUsername(Integer id) {
		String name = null;
		if(id == 100) {
			name="Rahul";
		}
		else if (id == 101) {
			name="Sonia";
		}
		else if (id == 102) {
			name="Priya";
		}
		return Optional.ofNullable(name);
	}
}
