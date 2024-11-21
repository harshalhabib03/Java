class IfElseIf{
	public static void main(String[] args) {
		int age = 85;
		if(age <= 10){
			System.out.println("Child");
		}
		else if(age >= 18){
			System.out.println("Young or Adult");
		}
		else if(age >= 35){
			System.out.println("Adult");
		}
		else{
			System.out.println("Old");
		}
	}
}