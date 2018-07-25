package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		
		int score = 75;
		
		boolean agrade = (score >= 90) && (score <= 100);
		boolean bgrade = (score >= 80) && (score <= 89);
		boolean cgrade = (score >= 70) && (score <= 79);
		boolean dgrade = (score >= 60) && (score <= 69);
		
		System.out.println(agrade);
		System.out.println(bgrade);
		System.out.println(cgrade);
		System.out.println(dgrade);
	}

}
