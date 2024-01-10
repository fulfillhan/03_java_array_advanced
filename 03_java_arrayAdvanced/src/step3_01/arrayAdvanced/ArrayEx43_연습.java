package step3_01.arrayAdvanced;
//2024-01-10
/*
 * # 달팽이
 *
 * 1	2	3	4	5
 * 16	17	18	19	6
 * 15	24	25	20	7
 * 14	23	22	21	8
 * 13	12	11	10	9
 *
 *
 * 1) 오른쪽 방향으로 순서대로 숫자저장
 * 2) 아래쪽 방향으로 순서대로 숫자저장
 * 3) 왼쪽 방향으로 순서대로 숫자저장
 * 4) 윗쪽 방향으로 순서대로 숫자저장
 *
 * 1)2)3)4) 반복
 */


public class ArrayEx43_연습 {
	
	public static void main(String[] args) {
		
		int size = 5;
		int[][] map = new int[5][5];
		boolean[][] isUsed = new boolean[5][5];//해당위치를 이미 사용했는지 여부
		
		int x = 0;//행
		int y = 0;//열
		int num = 1;         // 숫자 기본 초기값은 1이다.
		int dir = 1;        //-> 현재 이동 방향, 1(오른쪽) 2(하) 3(왼쪽) 4(상)
		
		map[y][x] = num;
		isUsed[y][x] = true;
		
		// 배열의 첫 번째 위치에 이미 값을 넣은 상태에서 시작하기 때문에 실제로 채워야 하는 남은 공간은 24개
		//24번 반복
		for (int i = 1; i < 24; i++) {
			int tempY = y;//(변경하고자 하는 y의 값)
			int tempX = x;//(변경하고자 하는 x의 값)
			
			//이동 방향에 따라 임시 변수 증가 or 감소
			
			if (dir == 1) tempX++;  //오른쪽이동-> x의 인덱스가 증가
			else if (dir == 2) tempY++;  //아래로->y읜 인덱스가 증가
			else if (dir == 3) tempX--;  //왼쪽으로이동-> x의 인덱스 감소
			else if (dir == 4) tempY--;  //위로->y의 인덱스 감소
			
			//새로운 위치가 배열의 범위를 벗어나거나, 이미 사용된 경우, 방향을 바꾸고 이전 위치로 돌아간다.
			//볌위가 벗어나는 조건식 만들기
			if (size <= tempX || tempX < 0 || size <= tempY || tempY < 0 || isUsed[tempY][tempX] == true) {
				//방향이 바뀐다.-> 인덱스도 기존의 인덱스를 저장한다.
				dir++;
				tempY = y;
				tempX = x;
				
				//방향의 범위가 다 돌고나면 dir=1 원점으로
				if (dir == 5) dir = 1;
				
				//다시 반복
				if (dir == 1) tempX++;
				else if (dir == 2) tempY++;
				else if (dir == 3) tempX--;
				else if (dir == 4) tempY--;
			}
			
			num++;
			
			y = tempY;
			x = tempX;
			
			map[y][x] = num;
			isUsed[y][x] = true;
			
			//System.out.println("y = "+ y + " x = "+ x);
		}
		//출력해보기
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
