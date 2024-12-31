package ConstructorRef;

import java.util.function.Supplier;

class Doctor{
	public Doctor() {
		System.out.println("Doctor constructor");
	}
}
//Constructor 
public class ConstructorRefEx {

	public static void main(String[] args) {
		//Doctor d = new Doctor();
		
		Supplier<Doctor> s = Doctor::new;
		Doctor doctor = s.get();
		System.out.println(doctor.hashCode());

	}

}
