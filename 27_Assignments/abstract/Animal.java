abstract class Aml{
	
	public void jump(){
		System.out.println("Jumps");
	}

	public abstract void play();

	public void wander(){
		System.out.println("Wanders");
	}
}

class Horse extends Aml{
	
	public void play(){
		System.out.println("Plays");
	}
}

public class Animal{

	public static void main(String[] args) {
		Horse obj = new Horse();
		  obj.jump();
		  obj.play();	
		  obj.wander();
	}
}