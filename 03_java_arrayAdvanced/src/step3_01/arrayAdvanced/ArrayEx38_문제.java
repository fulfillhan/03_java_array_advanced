package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_문제 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int[][] arr = new int[3][3];
 		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		System.out.println("========");
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int value = scan.nextInt();
		//거꾸로 index의 값을 가져오는 코딩은...
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j]== value) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 : "+ idx1);
		System.out.println("인덱스2 : "+ idx2);
		
		System.out.println("========");
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		
		///초기값으로 선언해주기
		int maxVal = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j= 0; j < arr[i].length; j++) {
				if (maxVal <= arr[i][j]) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 : "+ idx1);
		System.out.println("인덱스2 : "+ idx2);
		
		System.out.println("========");
		// 문제 4) 값 2개를 입력받아 값 교체
		
		
		
	



	}

}
