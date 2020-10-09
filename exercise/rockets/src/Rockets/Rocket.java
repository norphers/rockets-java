package Rockets;

import java.util.*;

public class Rocket {

	private String rocketID;
	private List<Propeller> powerPropellers = new ArrayList<Propeller>();
	private int initSpeed=0;
	private int speed;
	private int totalPowerNeed;
	
	public Rocket() {

	}
	
	public void SpeedUp() {
		for(Propeller p: powerPropellers) {
			p.setTargetPower(getTotalPowerNeed());
			p.start();
		}
	}
	
	public void stopRocket() throws InterruptedException {
		for(Propeller p: powerPropellers) {
			p.join();
		}
	}
	
	
	public void setRocketId(String id) {
		this.rocketID=id;
	}
	
	public void setPowerPropellers(List<Propeller> propellers) {  // add propellers in a list  
		this.powerPropellers=propellers;
	}
	
	public void setSpeed(int speed) { //add the speed that you want
		this.speed=speed;
	}

	public String getRocketId() {
		return rocketID;
	}
	
	public int getTotalPowerNeed() {
		totalPowerNeed= (int) Math.pow(((initSpeed-speed)/100),2);
		return totalPowerNeed + powerPropellers.size();
	}
	
	public int getTotalPower() { // total power of all propellers of the rocket	
		int totalPower = 0;
		for(Propeller power : powerPropellers) {
		    totalPower += power.getMaxPower();
		}
		return totalPower;
	}
	
	public String getPowerPropellersString(){ // print list without [ ]
		return powerPropellers.toString().substring(1).replaceFirst("]", "");
	}

}