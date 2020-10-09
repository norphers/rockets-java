package Rockets;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int setSpeed;
		Rocket rocket1; 
		Rocket rocket2; 
		rocket1= new Rocket();
		rocket2= new Rocket();
		List<Propeller>rocket1Propellers;
		List<Propeller>rocket2Propellers;
		
		rocket1.setRocketId("32WESSDS");
		rocket2.setRocketId("LDSFJA32");

		System.out.println("Rocket 1 - Propellers");
		rocket1Propellers =  new ArrayList<Propeller>();
		for(int i=0;i<3;i++) {
			rocket1Propellers.add(CreatePropeller(sc));
		}

		
		System.out.println("Rocket 2 - Propellers");
		rocket2Propellers =  new ArrayList<Propeller>();
		for(int i=0;i<6;i++) {
			rocket2Propellers.add(CreatePropeller(sc));
		}
		
		rocket1.setPowerPropellers(rocket1Propellers);
		rocket2.setPowerPropellers(rocket2Propellers);
		
		System.out.println(rocket1.getRocketId() + ": " + rocket1.getPowerPropellersString());
		System.out.println(rocket2.getRocketId() + ": " + rocket2.getPowerPropellersString());
		
		
		System.out.println("Enter a speed: ");
		setSpeed=sc.nextInt();
		
		rocket1.setSpeed(setSpeed); 	
		rocket1.SpeedUp();
		try {
			rocket1.stopRocket();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println("Enter a speed: ");
		setSpeed=sc.nextInt();
		
		rocket2.setSpeed(setSpeed); 	
		rocket2.SpeedUp();
		try {
			rocket2.stopRocket();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Propeller CreatePropeller(Scanner sc){
		
		
		System.out.println("Add the power of the propeller: ");
		int power = sc.nextInt();
		Propeller propeller = new Propeller(power);
		return propeller;
	}

}


