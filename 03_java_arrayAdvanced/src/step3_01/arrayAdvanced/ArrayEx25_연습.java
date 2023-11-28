package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;

//2023-11-27
//느낀점 : 이번 문제를 풀때, 단순 최대값의 데이터만 출력하기 보단 그 값의 위치값 index도 같이 생각해줘야 했다.
public class ArrayEx25_연습 {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int[] arr = {11,87,42,100,24};
	int cnt = 0;
	
	
	
	while (true) {
		
		System.out.println(Arrays.toString(arr));
		
		System.out.print("# 입력 : ");
		int maxNum = scanner.nextInt();
		
		System.out.println();
		
		
		int max = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
		}
		if (maxNum == max) {
			arr[maxIdx] = -1;
			cnt++;
			}
		if (cnt >= 5)  System.out.println("== 종료=="); 
		  break;
		}
	scanner.close();
 
	}

}
