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
				//array[] = {1,2,3,4,5,6} 5회수
				if (arr.length < delIdx || delIdx < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				if (elementCnt == 1) {
					arr = null;
				}else if (elementCnt > 1) {
					int[] temp = arr;
					arr = new int [elementCnt - 1];// arr[] 자리수 새로 선언
					
					// 취소하는 인덱스 값 전까지 반복하여 arr[i]에 대입
					for (int i = 0; i < delIdx; i++) {
						arr[i] = temp[i];
					}
					//delIdx = 0 이라면...
					for (int i= delIdx; i < arr.length; i++) {
						arr[i] = temp[i+1];
					}
					temp = null;
				}
				elementCnt--;
				
			}else if (sel ==3) {//삭제= 데이터를 입력받아 삭제한다.
			 System.out.print("삭제 데이터 입력 : ");
			 int delData = scan.nextInt();
			 
			 int delIdx = -1;
			 //delIdx 코딩 정의
			 for (int i = 0; i < elementCnt; i++) {
				if (delData == arr[i]) {//delData값과 arr[i]들어가 있는 숫자가 같다면
					delIdx = i;//삭제하고자 하는 익덱스 delIdx = i와 같다.
				}
			}
			 // break 구문 -  delData값이 
			 if (delData != -1) {
				System.out.println("[메세지]입력하신 데이터는 존재하지 않습니다.");
				continue;
			}
			 if (elementCnt ==1) {//[] 들어가 잇는 숫자가 한개라면
				arr = null;// 숫자 1개 들어가있는 꼴이니깐, 삭제하면 null 
			}
			 if (elementCnt > 1) {//[] 들어있는 숫자가 1보다 크다면, 즉 2개 이상 들어가있다면
				int[] temp = arr;//기존 arr배열을 temp 배열변수 만들어 임의로 대입하고
				arr = new int[elementCnt - 1];//arr 새로 배열 변수 정의= 삭제를하면 elementCnt -1개
				
				int j = 0;
				for (int i = 0; i < elementCnt; i++) {
				if (delIdx != i) {
					arr[j]= temp[i];//arr[0] = temp[0]
					j++;
				}
			}
			temp = null;	
		}
			elementCnt--;
			
			//삽입하여 추가하기
			//[삽입]인덱스 입력 
			//[삽입]데이터 입력 
			
			}else if (sel ==4) {
				System.out.print("[삽입] 인덱스 입력 : ");
				int insertIdx = scan.nextInt();
				
				//인덱스 조건에 맞지 않을시 continue 사용
				if (elementCnt < insertIdx || elementCnt < 0) {
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]데이터 입력 : ");
			    int insertData = scan.nextInt();
				
				if (elementCnt == 0) {
					arr = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {
					int[] temp = arr;
					arr= new int[elementCnt+1];
					
					int j = 0;
					for (int i = 0; i < elementCnt; i++) {
					if (i != insertData) {
					arr[i] =temp[j];
					j++;
						}
					}
					
					temp= null;
				} 
				elementCnt++;
				
			}
			else if (sel == 0) {
				System.out.println("== 종료 ==");
				scan.close();
				break;
			}
			
		}
		
	}

}
