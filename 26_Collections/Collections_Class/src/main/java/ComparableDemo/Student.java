package ComparableDemo;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int rank;
	
	public Student(int id, String name, int rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
	@Override
	public int compareTo(Student s) {
		//return this.id - s.id;
		//return this.name.compareTo(s.name);
		return this.rank - s.rank;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
	
}
