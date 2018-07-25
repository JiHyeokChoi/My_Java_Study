package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "홍길동";
		String year = "2002";
		int thisyear = 2017;		
		
		int workyear = thisyear - Integer.parseInt(year);
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + year);
		System.out.println("근무년수 : "+ workyear);
		
		
	}

}
