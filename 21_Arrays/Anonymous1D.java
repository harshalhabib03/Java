class Anonymous1D{
	public static void main(String[] args) {
		Anonymous1D.sum(new int[]{10,20,30});
	}
	static void sum(int[] n){
		int total=0;
		for (int i : n) {
			total=total+i;
		}
		System.out.println("Sum is: "+total);
	}
}


