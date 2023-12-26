package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

// 
public class ArrayEx29_연습2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int[] com = new int[3];
		int[] me = new int[3];
		boolean isDuple;
		int comNum = random.nextInt(9) + 1;

		// com에 랜던값으로 3개크기 배열 만들기
		for (int i = 0; i < com.length; i++) {
			if (com[i] == comNum) {
				com[i] = comNum;
				isDuple = true;
				
			}
			
		}

		while (true) {
			int strike = 0;
			int ball = 0;

			for (int i = 0; i < com.length; i++) {
				// 사용자 입력
				System.out.print("[" + (i + 1) + "] 1~9 입력 : ");
				int myMe = scanner.nextInt();

			}
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < me.length; j++) {
					if (com[i] == me[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			System.out.println("strike" + strike + "점");
			System.out.println("ball" + ball + "점");
			System.out.println();

			if (strike == 3) {
				System.out.println("정답을 맞혔습니다. 프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();

	}
}
