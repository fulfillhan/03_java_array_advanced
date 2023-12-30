package step3_01.arrayAdvanced;

//2023-12-30
//궁금했던 부분 : 최대값을 찾는 과정중에서 i=j로 선언한 이유?
//->이미 정렬된 부분을 건드릴 필요는 없어서 즉, 이미 정렬된 부분은 제외하고 나머지 부분을 비교하여 최대값을 찾고 다시 교환하여 배열한다.
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


public class ArrayEx31_연습 {

	public static void main(String[] args) {
		
		int[] scores = {10, 50, 30, 40, 80, 7};
		
		//최대값을 찾고
		//서로 비교, 교환한 뒤
		//인덱스0번부터 순차적으로 배열한다.
		
		int maxNum = 0;
		int maxIdx = 0;
		
		//배열의 요소를 점검하여 maxNum과 인덱스를 선언한다.(외부 배열)
		for (int i = 0; i < scores.length; i++) {
			
			 maxNum = scores[i];
			 maxIdx = i;
			 
			//최대값과 해당 인덱스를 찾아라(내부 배열)
			 for (int j = i; j < scores.length; j++) {
				if (maxNum < scores[j]) {
					maxNum = scores[j];
					maxIdx = j;
				}
			}
			 //교환하기
			 int temp = scores[i];
			 scores[i] = scores[maxIdx];
			 scores[maxIdx] = temp;
		}
		for (int printScores : scores) {
			System.out.print(printScores+ " ");
		}

	}

}
