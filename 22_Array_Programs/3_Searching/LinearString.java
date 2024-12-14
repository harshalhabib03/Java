class LinearString{
	public static void main(String[] args) {
		
		String[] a = {"jagdish", "suresh", "karan", "amrut", "ganesh"};
		String item="karan";
		int temp=0;

		for (int i=0; i<a.length; i++) {
			if (a[i].equals(item)) {
				System.out.println("item is present at "+i+" index position");
				temp=temp+1;
			}
		}
		if (temp==0) {
			System.out.println("item not found in list");
		}
	}
}