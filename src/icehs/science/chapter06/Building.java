package icehs.science.chapter06;

public class Building {

	String name;
	String address;
	int	totalFloor;
	
	public void moveElevator() {
		System.out.println("���������͸� " + totalFloor + "������ �����մϴ�.");
	}
	
	public void changAddress(String newAddress) {
		address = newAddress;
	}
	
	
}
