package icehs.science.chapter06;

public class Car {
		String name = "ICE카";
		double distance; 
		int oilAmount;
		
		
		void driveCar(String start, String end, double drivedistance) {
			distance += drivedistance;
			oilAmount -= drivedistance / 20 ;
			System.out.println(start + "에서 " + end + "까지 " + drivedistance + "km 주행하였습니다.");
		}
		
		void addOil(int oil) {
			oilAmount += oil;
			System.out.println("휘발유 " + oil + "L 주유합니다.");
		}
		
		void calculateDriveDistance() {
			distance = oilAmount * 20;
			System.out.println("주행 가능한 거리는 약 " + distance + "km 입니다.");
		}
		
		void printCarInfo() {
			System.out.println("[" + name + "~]" + "남은 기름양 : " + oilAmount + "L, 총 주행거리 : " + distance + "km");
		}
		
}
