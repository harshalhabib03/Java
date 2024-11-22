class LeapYear{
	public static void main(String[] args) {
		int year=2025;

		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 ==0){
					System.out.println("LeapYear");			//if divisible by 400
				}
				else{
					System.out.println("not a LeapYear");	//if not divisible by 400
				}
			}
			else{
				System.out.println("LeapYear");		//if divisible by 100
			}
		}
		else {
			System.out.println("not a LeapYear");	//if not divisible by 4
		}
	}
}