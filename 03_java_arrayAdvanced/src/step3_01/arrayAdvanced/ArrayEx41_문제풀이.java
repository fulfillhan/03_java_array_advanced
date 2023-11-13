package step3_01.arrayAdvanced;

import java.util.Scanner;

public class ArrayEx41_문제풀이 {
	/*
	 * # 사다리 게임
	 * 
	 * 1. 0을을 만나면 아래로 내려간다.
	 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
	 * 3. x의 위치를 입력받고 사다리를 표현한다.
	 * 		x = 0	x = 4
	 * 		x = 1	x = 2
	 * 		x = 2	x = 1
	 * 		x = 3	x = 3
	 * 		x = 4	x = 0
	 * 
	 *  특수문자 : ㅂ + '한자'
	 */
	
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		//사다리 ladder 배열 선언
		int[][] ladder = {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}
		};
		
		int x = 0;
		int y = 0;
		 
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				//0을 만날경우
			if (ladder[i][j] == 0) {
				System.out.println("│");
			}//1을 만날경우 좌우확인하는 코드 "─┤" 왼쪽으로 뻗은경우
		else if (ladder[i][j] == 1) {
			    //"j"줄이 0이 나오면 안되고 (왜냐하면 왼쪽으로 튀어나와있으니깐)j열의 숫자가 -1 이여야 한다
				if (j != 0 && ladder[i][j-1] == 1) {
					System.out.println("─┤ ");
				}
				//좌우확인하는 코드 "├─ " 우측으로 뻗은 경우
				else if (ladder[i][j+1] == 1 && j != ladder[i].length - 1) {
					System.out.print(" ├─");
				}
			}
			
			}
			System.out.println();
		}
		
		System.out.println("0~4 입력 :");
		x = scan.nextInt();
		
		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) {
				y++;
				//세로열 플러스
			}
			else if (ladder[y][x] ==1) {
				if (x != 0 && ladder[y][x-1] == 1) {
					x--;
				}
				else if (ladder[y][x+1] == 1  && x != 4 ) {
					x++;
				}
				y++;
			}
		}
		
		
		
	}
}
