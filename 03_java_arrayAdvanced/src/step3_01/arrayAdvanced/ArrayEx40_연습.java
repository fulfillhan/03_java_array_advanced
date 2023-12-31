package step3_01.arrayAdvanced;
//2023-12-31
/*
 *	# 관리비
*/

import java.util.Scanner;

public class ArrayEx40_연습 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		//apt 점검하여 각 apt 인덱스에 맞는 pay 데이터 추출하기
		for (int i = 0; i < apt.length; i++) {
			int total  = 0;
			for (int j = 0; j < pay.length; j++) {
				total += pay[i][j];
			}
			System.out.println((i+1)+"층의 관리비의 합"+ total+"원");
		}
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		System.out.print("호 입력 : ");
		int ho = scanner.nextInt();
		
		for (int i = 0; i < apt.length; i++) {// 열의 구분
			for (int j = 0; j < apt[i].length; j++) {// 행의 구분
				if (ho == apt[i][j]) {
					System.out.println("관리비 출력 : "+ pay[i][j]+"원");
				}
			}
		}
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		
		//최대값을 갖는 집의 인덱스를 찾기위한 변수
		int max = pay[0][0];
		int idx1 = 0;// 최대값의 열의 인덱스
		int idx2 =0; // 최대값의 행의 인덱스
		// 가장 많이 나온 집 확인하기
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(max < pay[i][j]){
					max = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		//각각 찾은 행과 열의 최대값 인덱스를 apt의 인덱스에 넣어 apt값 추출하기
		System.out.println("가장 많이 나온 집("+apt[idx1][idx2]+")");
		
		//최소값을 갖는 집의 인덱스를 찾기위한 변수
		int min = pay[0][0];
		idx1=0;
		idx2=0;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if(min > pay[i][j]){
					min = pay[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("가장 적게 나온 집("+apt[idx1][idx2]+")");
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		// 내가 입력한 호 2개 를 비교하여 temp배열에 넣고 서로 위치 바꾸기
		
		System.out.println("호1 입력 : ");
		int ho1 = scanner.nextInt();
		System.out.println("호2 입력 : ");
		int ho2 = scanner.nextInt();
		
		int i1 = 0;
		int j1 = 0;
		int i2 = 0;
		int j2 = 0;
		
		//입력한 값의 인덱스 값을 각각 찾아내기
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if(ho1 == apt[i][j]){
					i1 = i;
					j1 = j;
				}
				if (ho2 == apt[i][j]){
					i2 = i;
					j2 = j;
				}
			}
		}
		// temp 배열 저장하여 서로 교체하기
		int temp =pay[i1][j1];
		pay[i1][j1] = pay[i2][j2];
		pay[i2][j2] = temp;
		
		// 교체한 배열 출력하기
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j]+ " ");
			}
		  System.out.println();
		}
		
	}

}
