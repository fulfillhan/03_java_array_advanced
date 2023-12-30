package step3_01.arrayAdvanced;

/*
 * # 석차 출력
 *
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_연습 {
    public static void main(String[] args) {

        String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
        int[] scores = {87, 42, 100, 11, 98};


        //성적 순으로 배열을나열
        //높은점수 최대값을 점검하여 해당 인덱스 찾기
        //위치를 교환하여 0 에서부터 최대점수 나열하고
        //해당위치와 이름을 같이 나열하기

        //기존 배열(기준 :  점수)
        for (int i = 0; i < scores.length; i++) {
            int max = scores[i];
            int maxIdx = i;

            //최대 점수의 인덱스를 찾기
            for (int j = i; j < scores.length; j++) {
                if (max < scores[j]) {
                    max = scores[j];
                    maxIdx = j;
                }
            }
            
            // 최대값 점수를 교체해서 정열로 배열하기
            int temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
            
            // 최대값 점수의 인덱스와 같이 이름의 인덱스로 배열 교체하기.
            String temp1 = names[i];
            names[i] = names[maxIdx];
            names[maxIdx] = temp1;

        }
        
        for (String name : names) {
            System.out.print(name + " ");
        }


    }

}
