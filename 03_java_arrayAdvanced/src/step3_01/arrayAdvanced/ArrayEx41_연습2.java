package step3_01.arrayAdvanced;
// 2024-01-03
//깨달은 점 :  조건 생성시 인덱스위치로 잘 제어하여 열에 따라 내려갈 수 있게끔 조절할 수 있어야한다.
import java.util.Scanner;

public class ArrayEx41_연습2 {
	/*
	 * # 사다리 게임
	 * 
	 * 1. 0을을 만나면 아래로 내려간다.
	 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
	 * 3. x의 위치를 입력받고 사다리를 표현한다.
	 * 		x = 0	x = 4attractive
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
		
		int x = 0;//행s
		int y = 0;//열
		
		//사다리 만들기
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if(ladder[i][j] == 0) {
					System.out.println("│");
				}
				else if (ladder[i][j] == 1) {
					// 길이 제한
					//0의 인덱스가 아니고, 왼쪽위치의 요소가 1인 경우
					if(j != 0 && ladder[i][j-1] == 1) {
						System.out.println("─┤ ");
					}
					//우측의 끝(길이크기-1) 위치에서 오른쪽위치의 요소가 1인경우
					else if(j != ladder.length-1 && ladder[i][j+1]==1) {
						System.out.println(" ├─");
					}
				}
			}
			System.out.println();// 그 다음줄로 띄어주기
		}
		// 내가 입력한 값은 행의 값의 x변수 저장
		System.out.print("0~4 입력 : ");
		 x = scan.nextInt();
		
		//내가 입력한 값에 x 따라 y를 증가시키기
		for (int i = 0; i < ladder.length; i++) {// 사다리에서 내려가는 횟수
			// 0을이면 아래로 내려간다.
			if(ladder[y][x] == 0){
				y++;
			} else if (ladder[y][x]==1) {
				//두가지 조건이 있다
				if(x != 0 && ladder[y][x-1]==1){
					x--;
				}
				if(x != ladder.length-1 && ladder[y][x-1]==1){
					x++;
				}
				y++;
			}
		}
		System.out.println("x = "+ x);
		scan.close();
		 
	}
}
