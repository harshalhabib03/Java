class Employee{
	private int emp_id;			//Data Hiding

	public void setEmpId(int eid){		//setter
		emp_id=eid;
	}
	public int getEmpId(){				//getter
		return emp_id;
	}
}

class Company{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(101);
		System.out.println(e.getEmpId());
	}
}