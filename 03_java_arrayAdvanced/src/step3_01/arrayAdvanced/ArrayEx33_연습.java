package step3_01.arrayAdvanced;
/*

	# 중복 안된 숫자 제거
	
	int[] test1 = {1,2,3,2,1};		
	int[] test2 = {1,3,4,4,2};
	int[] test3 = {1,1,1,2,1};
	
	// 위 배열에서 중복안된숫자를 제거하시오. 
	  
	// 1) test1시험 result 확인 1 2 2 1
	// 2) test2시험 result 확인 4 4
	// 3) test3시험 result 확인 1 1 1 1
 
*/

import java.util.Arrays;

public class ArrayEx33_연습 {

	public static void main(String[] args) {

		int[] test1  = {1,2,3,2,1};
		int[] test2  = {1,3,4,4,2};
		int[] test3  = {1,1,1,2,1};
        int[] result1 = new int[5];

        // test1배열의 값을 하나씩 가지고와서 result 배열에 저장한다
		int resultIdx = 0;
		for (int i = 0; i < 5; i++) {
			result1[resultIdx] = test1[i];

			//다른 인덱스와 비교해서 중복체크
			int duppleCheck = 0;
			for (int j = 0; j < result1.length; j++) {
				// i != j 같은 인덱스이면 항상 중복으로 나오기때문에
				if(i !=j && result1[resultIdx] == test1[j]) {
					duppleCheck = 1;
				}
			}
			
			if (duppleCheck==1) {//중복되면 
				resultIdx++;//result 인덱스 증가
			}
		}
		for (int i = 0; i < resultIdx; i++) {
			System.out.print(result1[i]+ " ");
		}
	}
}
