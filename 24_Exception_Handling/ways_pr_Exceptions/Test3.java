//printing e.getMessage to know description

class Test3{
	public static void main(String[] args) {
		try{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}