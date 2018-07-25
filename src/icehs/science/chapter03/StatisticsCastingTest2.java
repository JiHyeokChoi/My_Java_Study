package icehs.science.chapter03;

public class StatisticsCastingTest2 {

	public static void main(String[] args) {
		double lottary = 0.0000001235;
		int intlottary = (int)lottary;
		System.out.println("로또에 당첨될 확률 : " + lottary);
		System.out.println("로또에 당첨될 확률 int 변환 : " + intlottary);
		
		long allpeople = 6973738433L;
		int intallpeople= (int)allpeople;
		System.out.println("전 세계의 인구 수 : " + allpeople);
		System.out.println("전 세계의 인구 수 int 변화 : " + intallpeople);
		
		
		
		

	}

}
