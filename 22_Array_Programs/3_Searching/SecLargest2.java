class SecLargest2{
	public static void main(String[] args) {
		
		int[] a = {5,8,2,4,9,6,1,3,7};
		int temp;

		int largest = Integer.MIN_VALUE;
		int sec_largest = Integer.MIN_VALUE;

		for (int i=0; i<a.length; i++) {
			if (a[i] > largest) {
				sec_largest=largest;
				largest=a[i];
			}
			else if (a[i] > sec_largest && a[i] != largest) {
				sec_largest=a[i];
			}
		}
		if (sec_largest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in the list");
		}
		else{
			System.out.println("second largest value is "+sec_largest);
		}
	}
}