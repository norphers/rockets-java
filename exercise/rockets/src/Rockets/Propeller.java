package Rockets;

public class Propeller extends Thread {
	
	private int maxPower;
	private int targetPower;
	private int currentPower;
	private int targetPowerCount;
	
	public Propeller(int maxPower) {	
		this.maxPower=maxPower;
	}
	
	public void setCurrentPower(int currentPower) {
		this.currentPower=currentPower;
	}
	
	public void setTargetPower(int targetPower) {
		this.targetPower=targetPower;
	}
	
	public int getMaxPower() {
		return maxPower;
	}
	
	public void run() {
	
		while(currentPower != targetPower && currentPower!=maxPower) {
			currentPower++;
			System.out.println ("Thread " + Thread.currentThread().getId() + " running. Current power: " + currentPower + " of " + maxPower);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public String toString() {
		return "" + maxPower;
	}

}

