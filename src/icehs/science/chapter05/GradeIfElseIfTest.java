package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		
		int gilldongScore = 92;
		
		if(gilldongScore >=90 && gilldongScore <=100)
		{
			System.out.println("A학점 입니다.");
		}
		else if(gilldongScore >=80 && gilldongScore <90)
		{
			System.out.println("B학점 입니다.");
		}
		else if(gilldongScore >=70 && gilldongScore <80)
		{
			System.out.println("C학점 입니다.");
		}
		else if(gilldongScore >=60 && gilldongScore <70)
		{
			System.out.println("D학점 입니다.");
		}
		else if(gilldongScore < 60 && gilldongScore >=0)
		{
			System.out.println("F학점 입니다.");
		}
		else {
			System.out.println("학점을 알 수가 없습니다. 점수를 잘못입력하셧습니다.");
		}

	}

}
