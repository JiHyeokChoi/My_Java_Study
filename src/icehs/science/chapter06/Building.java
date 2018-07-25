package icehs.science.chapter06;

public class Building {

	String name;
	String address;
	int	totalFloor;
	
	public void moveElevator() {
		System.out.println("엘리베이터를 " + totalFloor + "층까지 운행합니다.");
	}
	
	public void changAddress(String newAddress) {
		address = newAddress;
	}
	
	
}
