package icehs.science.chapter06;

public class Chocolate {
		String name;
		String type;
		int price;
		
		String getName() {
			return (name);
		}
		
		int calculateTotalPrice(int count) {
			return count * price;
		}
		void changeChocolateInfo(String newName, int newPrice) {
			name = newName;
			price = newPrice;
			printChocolateInfo();
			
		}

		void printChocolateInfo() {
			System.out.println("�̸� : " + name + ", ���� : " + type + ", ���� : " + price );
			
		}
		
		public int calculateTotalPrice( int count, int discount ) {
			return count * price * ( 100 - discount ) / 100;
		}
			
		public void chaangeChocolateInfo( String newName, String newType, int newPrice ) {
			name = newName;
			type = newType;
			price = newPrice;
			printChocolateInfo();
		}
		
		
}
