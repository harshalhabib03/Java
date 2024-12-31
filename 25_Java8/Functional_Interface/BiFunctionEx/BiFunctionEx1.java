package BiFunctionEx;

import java.util.function.BiFunction;

public class BiFunctionEx1 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bif = (i,j) -> (i+j);
		System.out.println(bif.apply(15, 20));

	}

}
