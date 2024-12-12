class Array1D{
	public static void main(String[] args) {
			
		int[] a = new int[3];			//declaration & creation in one line
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println();

		int[] b = {10,20,30};			//initialization
		// for (int i=0; i<=2; i++) 
		for (int i=0; i<a.length; i++) {		//for loop
			System.out.println(b[i]);
		}
		
		System.out.println();
		
		for (int i : b) {				//for each loop
			System.out.println(i);
		}
	}
}