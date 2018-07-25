package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		
		int num = 64;
		
		boolean isOdd = (num % 2 == 0);
		boolean isMultiof3 = (num % 3 == 0);
		boolean isMultiof2and7 = (num % 2 == 0) && (num % 7 == 0);
		boolean isMultiof2or7 = (num % 2 == 0) || (num % 7 == 0);
		
		System.out.println("짝수입니까 ? :" + isOdd );
		System.out.println("3의 배수입니까? : " + isMultiof3 );
		System.out.println("2의 배수이면서 7의 배수입니까? : " + isMultiof2and7 );
		System.out.println("2의 배수이거나 7의 배수입니까? : " + isMultiof2or7 );
		

	}

}
