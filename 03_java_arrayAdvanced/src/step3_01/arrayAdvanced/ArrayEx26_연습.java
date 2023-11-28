package step3_01.arrayAdvanced;
//2023-11-28
// 어려웠던 부분 : 섞기 알고리즘 이해가 부족했다.
//특히, oneToNine[ranIdx] = temp;에서 temp의 값을 oneToNine배열에서 ranIdx의 요소에 할당한다.
//즉, oneToNine[0] 의 요소와 랜덤으로 선택된 oneToNine[ranIdx]의 값을 교환!!한다.
// 질문!! while 문으로 가능한지? ) 섞기 알고리즘은 while 문으로도 사용 가능 ex) while(i < 1000)
// while(true) 한다면 무한 루프에 빠지지 않게 종료 조건을 설정하기!

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고,
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */

public class ArrayEx26_연습 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		final int SIZE = 9;//변하지 않는 값, 상수
		//int i = 0;
		
		int[] oneToNine = new int[9];
		int[] tenToEightTeen = new int[9];
		
		//배열 초기화
		for (int i = 0; i <SIZE; i++) {
			oneToNine[i] = i + 1;
			tenToEightTeen[i] = SIZE + (i +1);
		}
		
		//섞기 코딩[oneToNine 배열/ tenToEightTeen 배열] 
		//위치값을 랜덤으로 받는다..
		for (int i = 0; i < 1000; i++) {
			int ranIdx = random.nextInt(SIZE);
			
			//oneToNine 배열의 요소를 교환
			int temp = oneToNine[0];//temp의 변수는 해당 배열의 첫번째 요소의 값을 할당받는다.
			oneToNine[0] = oneToNine[ranIdx];//첫 번째 요소에 랜덤으로 선택된 요소의 값으로 대체된다.
			oneToNine[ranIdx] = temp; // -> 이부분 이해가 잘 안됨 : ↑ 설명
			
			//tenToEightTeen 배열의 요소 교환
			temp = tenToEightTeen[0];
			tenToEightTeen[0] = tenToEightTeen[ranIdx];
			tenToEightTeen[ranIdx] = temp;
			
		}
			//게임 초기 설정
			int questionNum = 1;//맞춰야 하는 숫자로 1로 초기화됨
		    while (true) {
				
		    	//모두 맞친경우 ->> 프로그램 종료
		    	if (questionNum == 19) {
					System.out.println("모두 맞췄습니다. 프로그램 종료");
					break;
				}
		    	//출력
		    	System.out.println("\n\n");
		    	for (int i = 0; i < SIZE; i++) {
					if (oneToNine[i] != -1) System.out.print(oneToNine[i] + "\t");
					
					//현재 출력중인 i의 요소를 활용하여 행의 마지막 열인지 확인
					if (i % 3 == 2) {
						System.out.println("\n"); //한 줄 띄기
					}
		    	}
					//인덱스 입력 받기
					System.out.print("["+questionNum+ "] 의 인덱스 입력 : ");
					int myAnswer = scanner.nextInt();
					
					// 정답 비교하기
					if (oneToNine[myAnswer] == questionNum) {// 입력한 값이 해당 요소와 일치하면-> 해당 조건이 true이면
						
						if (1 <= questionNum && questionNum <= SIZE) {//-> questionNum의 유효한 범위 내이면
							oneToNine[myAnswer] = tenToEightTeen[myAnswer];// tenToEightEeen으 요소로 업데이트
							
						}else { //-> 유효한 범위가 아니라면
							oneToNine[myAnswer]= -1;
						}
						questionNum++;
					}
						
					}
		    	scanner.close();
			}
		}
	
		
	


