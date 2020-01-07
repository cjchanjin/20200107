package co.cjpark.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int gameCnt;
	
	
	public Lotto() {
		// TODO Auto-generated constructor stub
	}

	public final int getGameCnt() {
		return gameCnt;
	}


	public final void setGameCnt(int gameCnt) {
		this.gameCnt = gameCnt;
	}

	public void run() {
		lottoGame();
	}
	
	public void upTitle() {
		System.out.println("=======LOTTO=======");
	}
	
//	public void toPrint() {
//		System.out.println(lottoArry[6] + " ");
//	}
	
	public void downTitle () {
		System.out.println("====================");
	}
	
//	private void toPrint() {
//		System.out.print(lottoArry + " ");
//		System.out.println();
//	}
	
	
	public void lottoGame() {
//		boolean run = true;
//		while (run); {

		Random random = new Random();
		int game = gameCnt;  					//게임 수 구하기
		for(int i =0; i<game; i++) {		//게임수 만큼 생성
			
			int []lottoArry = new int[6];
			for(int j =0; j<lottoArry.length; j++) {
				lottoArry[j] = random.nextInt(45)+1;
				for(int k = 0; k<j; k++) {					//중복제거
					if(lottoArry[j] == lottoArry[k]) j--;
				}
			}
			Arrays.sort(lottoArry);		//오름차순 정렬
			if(i % 5 ==0) {
				upTitle();
			}
//			toPrint(lottoArry);
			System.out.print(lottoArry[]+ " ");
			System.out.println();
		}
		downTitle();
//		run = false;	
	}
}
	
	
		

