package BiPredicateEx;

import java.util.function.BiPredicate;

public class BiPredicateEx1 {

	public static void main(String[] args) {
		
		//Using BiPredicate 
		BiPredicate<Integer, Integer> bip = (i,j) -> (i+j) >=20;
		System.out.println(bip.test(2, 5));
		System.out.println(bip.test(12, 8));
	}

}
