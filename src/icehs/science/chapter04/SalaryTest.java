package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		
		int monthmoney = 1000000;
		int yearmoney = monthmoney*12;
		int yearmoney2 = yearmoney - yearmoney / 10;
		int bonus = monthmoney * 20 / 100 * 4;
		int bonus2 = bonus - bonus * 55 / 1000;
		int money = yearmoney2 + bonus2;
		
		System.out.println("연봉 : " + yearmoney + ", 세후 연봉 : " + yearmoney2);
		
		System.out.println("보너스 : " + bonus +", 세후 보너스 : " + bonus2);
		
		System.out.println("지급액 : " + money);

	}

}
