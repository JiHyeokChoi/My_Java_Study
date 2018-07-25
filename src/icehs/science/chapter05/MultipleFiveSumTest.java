package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int i = 1;
		int index = 1;
		int sum = 0;
		
		
		while( sum <= 100  ) {
			if(i % 5 == 0) {
				sum +=i;
				System.out.println(index + ". ( + " + i +" ) " + sum);
				index++;
			}
			i++;
		}
	}

}
