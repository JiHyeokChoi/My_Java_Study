package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee makiyatto = new Coffee();
		makiyatto.name = "�����߶�";
		makiyatto.price = 4500;
		makiyatto.printCoffeeInfo();
		
		int totalPrice = americano.getPrice() + latte.getPrice() + makiyatto.getPrice();
		System.out.println("�� �ݾ� : " + totalPrice + "��");
	}

}
