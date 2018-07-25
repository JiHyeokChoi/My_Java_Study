package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		
		int score1 = 10;
		int score2 = 20;
		int score3 = 40;
		int score4 = 50;
		int score5 = 80;
		
		int s1multiflys2half = score1 * score2 / 2;
		int s3sums4half = ( score3 + score4 ) / 2;
		
		double allscore = (double)s1multiflys2half * 60 / 100 + (double)s3sums4half * 13 / 100 + (double)score5 * 27 / 100;
		
		
		System.out.println("평가 점수 : " + allscore);
		
		if( allscore >= 95 && allscore <=100 ) {
			System.out.println("Special Class 입니다!!");
		}
		else if( allscore >= 90 && allscore < 95 ) {
			System.out.println("Gold Class 입니다!!");
		}
		else if( allscore >= 85 && allscore < 90 ) {
			System.out.println("Silver Class 입니다!!");
		}
		else if( allscore >= 80 && allscore < 85 ) {
			System.out.println("Bronze Class 입니다!!");
		}
		else if( allscore < 80 ) {
			System.out.println("Member Class 입니다!!");
		}
		
	}

}
