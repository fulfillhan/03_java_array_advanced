package step3_01.arrayAdvanced;

public class ArrayEx37 {
	
		public static void main(String[] args) {
			
			int[][] arr = new int[2][4];//크기가 무조건 4개(1차원)가 2개(최신)
			
			arr[0][0]=10;
			arr[0][1]=20;
			arr[0][2]=30;
			arr[0][3]=40;
			
			arr[1][0]=50;
		    arr[1][1]=60;
		    arr[1][2]=70;
		    arr[1][3]=80;
		    		
    	   System.out.println("arr : ");
		   System.out.println("arr [0] : "+ arr[0]);
		   System.out.println("arr [1] : "+ arr[1]);
		    		
		   System.out.println("arr[0][0] : "+ arr[0][0]);
		   System.out.println("arr[0][1] : "+ arr[0][1]);
		   System.out.println("arr[0][2] : "+ arr[0][2]);
		   System.out.println("arr[0][3] : "+ arr[0][3]);
		   System.out.println();
		   
		   System.out.println("arr[1][0] : "+ arr[1][0]);
		   System.out.println("arr[1][1] : "+ arr[1][1]);
		   System.out.println("arr[1][2] : "+ arr[1][2]);
		   System.out.println("arr[1][3] : "+ arr[1][3]);
		   System.out.println("=========");
		   
		   //메인-> 세로줄
		   for (int i = 0; i < 2; i++) {
			   //sub -> 가로줄
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
	   }
		System.out.println();
		//세로줄의길이
		System.out.println("arr.lengh : "+ arr.length);
		//각 줄의 길이(가로줄)
		System.out.println("arr[0].lengh : "+ arr[0].length);
		System.out.println("arr[1].lengh : "+ arr[1].length);
		System.out.println("===========");
		
		//메인-> 세로줄기준으로
		   for (int i = 0; i < arr.length; i++) {
			   //sub 가로줄 기준으로
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			System.out.println("==");
			
			//생각해보기
			int[][] temp1 = arr;// 주소 [참조]
			int[] temp2 = arr[0];//주소 [참조]
			int[] tmep3 = arr[1];//주소	[참조]	
			int temp4 = arr[0][0];//데이터
			int temp5 = arr[1][1];//데이터
			
			System.out.println("====");
			
			//축약형 2차원 배열
			int[][] testArr = {{10,20,30,40,50},
			              	{60,70,80,90,100},
		            	  	{110,120,130,140,150}};
			for (int j = 0; j < testArr.length; j++) {// 세로줄
				for (int j2 = 0; j2 < testArr[j].length; j2++) {// 가로줄
					System.out.print(testArr[j][j2]+ " ");
				}
				System.out.println();
			}
			
			}
		
		}
		}


