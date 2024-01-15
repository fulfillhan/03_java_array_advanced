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


public class ArrayEx43_연습2 {
	
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
		
		for (int i = 0; i < 24; i++) {
			 int xx = x; //변화하는 행의 변수
			 int yy = y; //변화하는 열의 변수
			 
				
			 if(dir == 1)        xx++;  //오른쪽 이동
			 else if (dir == 2)  yy++;  //아래로 이동
			 else if (dir == 3)  xx--;  //왼쪽으로 이동
			 else if (dir == 4)  yy--;  //위로 이동
				
			//방향이 달라지는 로직
			if(xx < 0 || size <= xx || yy < 0 || yy >= size || isUsed[yy][xx] == true){
				dir ++;
				xx = x;
				yy = y;
				
				if(dir == 5) dir =1;
				
				if(dir == 1)        xx++;
				else if (dir == 2)  yy++;
				else if (dir == 3)  xx--;
				else if (dir == 4)  yy--;
			}
			num ++;
			x = xx;
			y = yy;
			
			map[y][x] = num;
			isUsed[y][x] = true;
			
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
	
}
