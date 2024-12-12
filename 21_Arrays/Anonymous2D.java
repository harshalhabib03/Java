class Anonymous2D{
	public static void main(String[] args) {
		Anonymous2D.sum(new int[][]{{10,20,30},{40,50}});
	}
	static void sum(int[][] n){
		int total=0;
		for (int ii[] : n) {
			for (int i : ii) {
				total=total+i;	
			}
		}
		System.out.println("Sum is: "+total);
	}
}


