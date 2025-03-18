package StringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String s = "Java Programming Course";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
