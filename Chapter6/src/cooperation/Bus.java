package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //½Â°´À» ÅÂ¿üÀ»¶§ 
		this.money = money;
		passengerCount ++;
	}
	
	public void showInfo() {
		
		System.out.println("¹ö½º" + busNumber + "¹øÀÇ ½Â°´Àº" + passengerCount +"¸íÀÌ°í , "
				+ "¼öÀÔÀº" + money+"ÀÔ´Ï´Ù.");
	}
}
