package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeEx {

	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>(); 
		al.add(new Employee(104, "Cathy", 15000.00));
		al.add(new Employee(101, "David", 45000.00));
		al.add(new Employee(103, "Anna", 38000.00));
		al.add(new Employee(102, "Priya", 18000.00));
		
		//Collections.sort(al, new EmpIdComparator());
		Collections.sort(al, new EmpNameComparator());
		
		//Anonymous implementation
		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
			return e1.id - e2.id;
			}
		});

		Collections.sort(al, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
			return e1.name.compareTo(e2.name);
			}
		});
		
		Collections.sort(al, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.id > e2.id) {
					return 1;
				}
				else if (e1.id < e2.id) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		
		Collections.sort(al, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.id > e2.id) {
					return -1;
				}
				else if (e1.id < e2.id) {
					return 1;
				}
				else {
					return 0;
				}
			}
		});

		for (Employee e : al) {
			System.out.println(e);
		}
	}

}
