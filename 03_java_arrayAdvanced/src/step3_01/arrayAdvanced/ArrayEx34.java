package step3_01.arrayAdvanced;

import java.util.Arrays;

// 배열주소의 활용

public class ArrayEx34 {

	public static void main(String[] args) {

		int nVar1 = 10;
		int nVar2 = nVar1;//데이터 대입
		
		nVar1 = 12;
		
		System.out.println("nVar1 : " + nVar1);//12
		System.out.println("nVar2 : " + nVar2);//10
		System.out.println();
		
		int[] arr = {87,100 , 24, 11, 79};
		int[] temp = arr;//temporary 일시의// 주소(참조)대입
		
		arr[0] = 0;
		temp[1] = 0;
		arr[2] = 0;
		temp[3] = 0;
		arr[4] = 0;
		
		
		System.out.println(Arrays.toString(arr));//[0, 100, 24, 11, 79]
		System.out.println(Arrays.toString(temp));//[0, 100, 24, 11, 79]
		
	}

}
