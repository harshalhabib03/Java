class MinNum{
	public static void main(String[] args) {
		
		int[] a = {8,5,7,6,9,2,4};
		int min=a[0];

		for (int i=1; i<a.length; i++) {
			if (min > a[i]) {
				min=a[i];
			}
		}
		System.out.println("minimum element is "+min);
	}
}