package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //½Â°´À» ÅÂ¿üÀ»¶§ 
		passengerCount ++;
		this.money = money;
	}
}
