package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int num = 456;
		
		
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + num / 100);
		System.out.println("십의 자리 수 : " + num % 100 / 10);
		System.out.println("일의 자리 수 : " + num % 100 % 10);

	}

}
