class Employee1{
	int empid;
	String ename;
	String company;

	Employee1(int empid, String ename, String company){
		this.empid=empid;
		this.ename=ename;
		this.company=company;
	}

	void display(){
		System.out.println(empid+" "+ename+" "+company);
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101, "Kabir", "PL");
		e1.display();
		Employee1 e2 = new Employee1(102, "Sunny", "PL");
		e2.display();
		Employee1 e3 = new Employee1(103, "Pradeep", "PL");
		e3.display();
	}
}