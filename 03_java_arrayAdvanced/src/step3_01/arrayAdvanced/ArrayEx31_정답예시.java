package step3_01.arrayAdvanced;

/*
 * # 정렬하기
 * 
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 30, 40, 10, 7
 * 80, 50, 40, 30, 10, 7
 */

public class ArrayEx31_정답예시 {
	
	public static void main(String[] args) {

		int[] scores = {10, 50, 30, 40, 80, 7};
		
		int maxNum = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			
			maxNum = scores[i];
			maxIdx = i;
				
			for (int j = i; j < scores.length; j++) {
				if (maxNum < scores[j]) {
					maxNum = scores[j];
					maxIdx = j;
				}
			}
			
			int temp = scores[i];
			scores[i] = scores[maxIdx];
			scores[maxIdx] = temp;
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
	}

}
