package icehs.science.chapter05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		
		int gilldongScore = 92;
		
		if(gilldongScore >=90 && gilldongScore <=100)
		{
			System.out.println("A���� �Դϴ�.");
		}
		else if(gilldongScore >=80 && gilldongScore <90)
		{
			System.out.println("B���� �Դϴ�.");
		}
		else if(gilldongScore >=70 && gilldongScore <80)
		{
			System.out.println("C���� �Դϴ�.");
		}
		else if(gilldongScore >=60 && gilldongScore <70)
		{
			System.out.println("D���� �Դϴ�.");
		}
		else if(gilldongScore < 60 && gilldongScore >=0)
		{
			System.out.println("F���� �Դϴ�.");
		}
		else {
			System.out.println("������ �� ���� �����ϴ�. ������ �߸��Է��ϼ˽��ϴ�.");
		}

	}

}
