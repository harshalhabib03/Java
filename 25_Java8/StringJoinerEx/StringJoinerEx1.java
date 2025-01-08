package StringJoinerEx;

import java.util.StringJoiner;

public class StringJoinerEx1 {

	public static void main(String[] args) {
		//using StringJointer to Concatinate with delimeter
		StringJoiner sj = new StringJoiner("-");
		sj.add("StringJoiner");
		sj.add("using");
		sj.add("Delimeter");
		
		System.out.println(sj);	//Welcome-to-Java
	}

}
