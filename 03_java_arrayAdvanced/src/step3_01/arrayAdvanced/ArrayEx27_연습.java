package step3_01.arrayAdvanced;
//2023-12-03 오전
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

public class ArrayEx27_연습 {
	
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0,0,1,0,0,0,1,0};
		int playerIdx = 0;
		
		//player 위치값 구하기
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {    // 2는 캐릭터, 해당 요소와 같아지면 위치값 = player
				playerIdx = i;
			}
		}
		
		while (true) {
			
			
			// 화면 출력
			for (int i = 0; i < game.length; i++) {   //배열 상태를 살펴보고
				if (game[i] == 2) {                   //요소가 2이면
					System.out.print("옷 ");          //"옷" 으로 출력한다.
				}
				else {
					System.out.print(game[i]+ " ");   //그렇지 않으면 해당요소 그대로 출력한다.
				}
			}
			System.out.println();
			
			System.out.print("왼쪽(1) 오른쪽(2) 종료(0) 숫자입력 : ");
			int sel = scanner.nextInt();
			
			if (sel== 1 ) {
				if (playerIdx -1 >= 0) {              //범위를 벗어나지 않도록 한다/ 위동하려는 위치가 첫위치0 이상이어야한다.
					if (game[playerIdx -1] == 1) {    // 이동하려는 위치의 요소에 장애물이 있는지 확인
						System.out.print("격파[3] 입력 : ");
						int punch = scanner.nextInt();
						if (punch != 3) {             //3이 아니라면 다시 루프 시작
							continue;
						}
					}
					game[playerIdx -1] =2;
					game[playerIdx] = 0;
					playerIdx--;
				}
			}
			else if (sel == 2) {
				if (playerIdx+1 < game.length) {
					if (game[playerIdx+ 1] == 1) {
						System.out.print("격파[3] 입력 : ");
						int punch = scanner.nextInt();
						if (punch != 3) {
							continue;
						}
					}
					game[playerIdx + 1] = 2;
					game[playerIdx] = 0;
					playerIdx++;
				}
			}
			else if (sel== 0 ) {
				System.out.println("==프로그램 종료==");
				scanner.close();                              
				break;
			}
			  
		}
		
	}

}
