package step3_01.arrayAdvanced;

import java.util.Random;

//2023-12-04 오전

/*
 * # 중복숫자 금지[2단계]
 * 
 * 1. arr배열에 1~10 사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */

public class ArrayEx28_연습 {
	
public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		int cnt = 0; //반복 횟수
		
		while (cnt < 5) {
		int rNum = ran.nextInt(10)+1;
		
		int dupleCnt = 1;
		for (int i = 0; i < arr.length; i++) {
			 if (arr[i] == rNum) {
				dupleCnt ++;
			}
				
			}
		}
		
			
		}
	}
	


