//Saleh ALobaylan 441102323
public class TestFan {

	public static void main(String[] args) {
		
		Fan frstFan = new Fan();
		Fan secFan = new Fan();
		
		frstFan.increaseSpeed();
		frstFan.increaseSpeed();
		frstFan.increaseSpeed();
		secFan.decreaseSpeed();
		
		System.out.println("-------------");
		
		frstFan.changeColor("yellow");
		frstFan.changeRadius(10);
		frstFan.turnOn();
		
		System.out.println("Fan1: "+frstFan.toString());
		
		System.out.println("-------------");
		
		System.out.println("Fan2: "+secFan.toString());

	}

}
