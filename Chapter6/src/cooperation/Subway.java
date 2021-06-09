package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { //½Â°´À» ÅÂ¿üÀ»¶§ 
		this.money = money;
		passengerCount ++;
	}
	
	public void showInfo() {
		
		System.out.println("ÁöÇÏÃ¶" + lineNumber + "¹øÀÇ ½Â°´Àº" + passengerCount +"¸íÀÌ°í , "
				+ "¼öÀÔÀº" + money+"ÀÔ´Ï´Ù.");
	}
}
