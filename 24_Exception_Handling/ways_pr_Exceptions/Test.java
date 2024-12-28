//using e.printStackTrace to know
//exception name, description & stack trace

class Test{
	public static void main(String[] args) {
		try{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}