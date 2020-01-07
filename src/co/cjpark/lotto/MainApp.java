package co.cjpark.lotto;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		System.out.println("투입할 금액을 입력하세요 (1게임당 1,000원)");
		int payMoney = sc.nextInt();
		sc.nextLine();
				
		lotto.setGameCnt(payMoney / 1000);
		System.out.println("로또" + lotto.getGameCnt() + "회를 구입하셨습니다");
		
		lotto.run();
		
	}
	
	
}
