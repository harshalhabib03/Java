package StringJoinerEx;

import java.util.StringJoiner;

public class StringJoinerEx2 {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-", "(", ")");
		sj.add("StringJoiner");
		sj.add("using");
		sj.add("prefix");
		sj.add("suffix");
		
		System.out.println(sj);		//(StringJoiner-using-prefix-suffix)
	}

}
