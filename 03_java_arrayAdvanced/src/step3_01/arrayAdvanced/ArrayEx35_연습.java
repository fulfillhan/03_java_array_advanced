package step3_01.arrayAdvanced;

/* 배열의 정의에 대해 다시 공부!
 * 타입[] 변수 = null; 변수 = new 타입[길이];
 */

import java.util.Scanner;


/*
 * 
 * # 배열 컨트롤러[2단계] : 어레이리스트(ArrayList) -> 가변적/이미 만들어져있음
 * 어레이의 단점 :  크기가 fix > 가성비 이슈
 *
 * 1. 추가
 * . 데이터를 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 데이터 삭제
 * 3. 삭제(데이터)
 * . 데이터를 입력받아 삭제
 * . 없는 데이터 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 데이터을 입력받아 삽입
 * 
 */

public class ArrayEx35_연습 {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int[] arr = null;
		int elementCnt = 0;
		
		while (true) {
			
			for (int i = 0; i < elementCnt; i++) {
				System.out.println(arr[i]+ " ");
			}
			System.out.println();
			
			System.out.println("[어레이리스트 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(데이터)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			// 추가하기
			if (sel == 1) {
				if (elementCnt == 0) {
					arr =  new int[elementCnt + 1]; // arr = new int[길이] 
				}
				else if (elementCnt >0) {
					int[] temp = arr;//temp 배열을 생성해서 arr의 값을 선언
					arr = new int[elementCnt+1];//arr값에 elementCnt+1 길이의 배열 선언
					
					for (int i = 0; i < temp.length; i++) {
						 arr[i]=temp[i];
					}
					temp = null;
				}
				System.out.print("추가할 데이터 입력 : ");
				int data = scan.nextInt();
				
				 arr[elementCnt]= data;
				elementCnt++;
				// 삭제하기
			}else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");
				int delIdx = scan.nextInt();
				//먼저 삭제할 수 없는 값의 범위 조건 정하기 (인덱스 elementCnt=0보다 작으면 안되고 elementCnt-1 보다 커값을 넘어가면 안됨)
				if (elementCnt <= delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {
					arr = null;
				}else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int [elementCnt - 1];// arr[] 자리수 새로 선언
					
					
				}
				
			}else if (sel ==3) {
				
			}else if (sel ==4) {
				
			}else if (sel == 0) {
				System.out.println("== 종료 ==");
				scan.close();
				break;
			}
			
		
			
		}
		
	}

}
