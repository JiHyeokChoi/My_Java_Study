package icehs.science.chapter06;

public class Car {
		String name = "ICEī";
		double distance; 
		int oilAmount;
		
		
		void driveCar(String start, String end, double drivedistance) {
			distance += drivedistance;
			oilAmount -= drivedistance / 20 ;
			System.out.println(start + "���� " + end + "���� " + drivedistance + "km �����Ͽ����ϴ�.");
		}
		
		void addOil(int oil) {
			oilAmount += oil;
			System.out.println("�ֹ��� " + oil + "L �����մϴ�.");
		}
		
		void calculateDriveDistance() {
			distance = oilAmount * 20;
			System.out.println("���� ������ �Ÿ��� �� " + distance + "km �Դϴ�.");
		}
		
		void printCarInfo() {
			System.out.println("[" + name + "~]" + "���� �⸧�� : " + oilAmount + "L, �� ����Ÿ� : " + distance + "km");
		}
		
}
