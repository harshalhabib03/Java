class Employee2{
	int empid;
	String ename;
	static String company="PL";				//using static keyword to occupy less memory & run fast

	Employee2(int empid, String ename){
		this.empid=empid;
		this.ename=ename;
	}

	void display(){
		System.out.println(empid+" "+ename+" "+company);
	}

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(101, "Kabir");
		e1.display();
		Employee2 e2 = new Employee2(102, "Sunny");
		e2.display();
		Employee2 e3 = new Employee2(103, "Pradeep");
		e3.display();
	}
}