package step3_01.arrayAdvanced;
//2023-11-30  -> 시간이 되면 풀어보기
/*
 * # 숫자이동[2단계]
 *
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

import java.util.Scanner;

public class ArrayEx27_연습2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
		int playerIdx = 0;
		
		//캐릭터가 '2'라는 것을 표시하기 how?-> 플레이어의 인덱스값을 구하기
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				playerIdx = i;
			}
		}
		while (true) {
			
			System.out.print("[ ");
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) System.out.print("옷 ");
				else              System.out.print(game[i] + " ");
			}
			System.out.println("]");
			
			System.out.print("왼쪽(1) 오른쪽(2) 종료(0) 입력 : ");
			int move = scan.nextInt();
			
			if (move == 1) {
				if (playerIdx != 0) {//playerIdx != 0
					// 플레이어의 위치가  좌우 끝에 도달했을 때, 예외처리를 해야한다.
					if (game[playerIdx - 1] == 1) {
						System.out.print("격파[3] 입력 : ");
						int punch = scan.nextInt();
						if (punch != 3) {
							System.out.println("격파 실패!");
							continue;
						}
					}
					game[playerIdx] = 0;
					game[playerIdx - 1] = 2;
					playerIdx--;
					
				} else System.out.println("[메시지] 더 이상 왼쪽으로 이동할 수 없습니다.");
			} else if (move == 2) {
				if (playerIdx != game.length - 1) {
					if (game[playerIdx + 1] == 1) {
						System.out.print("격파[3] 입력 : ");
						int punch = scan.nextInt();
						if (punch != 3) {
							System.out.println("격파 실패!");
							continue;
						}
					}
					game[playerIdx] = 0;
					game[playerIdx + 1] = 2;
					playerIdx++;
				} else System.out.println("[메시지] 더 이상 오른쪽으로 이동할 수 없습니다.");
			} else if (move == 0) {
				System.out.println("종료되었습니다");
				break;
			}
			
		}
		scan.close();
	}
}

