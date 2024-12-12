class Traverse1D{
	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		//for loop
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//for each loop
		for (int i: a) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while loop
		int i=0;
		while(i<a.length){
			System.out.print(a[i]+" ");
			i++;
		}
		System.out.println();
		//do while loop
		int j=0;
		do{
			System.out.print(a[j]+" ");
			j++;
		}
		while(j<a.length);
	}
}