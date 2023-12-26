package step3_01.arrayAdvanced;

//2023-12-25
import java.util.Scanner;

public class ArrayEx30_연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int userCnt = 0;
		int identifier = -1;

		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료\n";

		while (true) {

			System.out.println("[회원수 : " + userCnt + "명]");
			for (int i = 0; i < userCnt; i++) {
				System.out.println(arId[i] + ":" + arPw[i] + "(" + arMoney[i] + ")");
			}
			System.out.println("-----------------");
			System.out.print("접속자 : ");
			if (identifier == -1) {
				System.out.println("없음");
			} else
				System.out.println(arId[identifier]);
			System.out.println("-----------------");

			System.out.println(menu);
			System.out.print("번호 입력 : ");
			int sel = scan.nextInt();

			// 회원가입 , acc,pw 입력받아 가입하고 가입 시 돈 1000원 부여받음
			if (sel == 1) {

				System.out.print("[가입]아이디 입력 : ");
				int myId = scan.nextInt();

				int check = 1;
				for (int i = 0; i < userCnt; i++) {
					if (arId[i] == myId) {
						check = -1;// 반복되는 경우
					}
				}
				if (check == 5) {
					System.out.println("회원가입은 5번까지만 가능합니다.");
					continue;
				}
				if (check == -1) {
					System.out.println("아이디가 중복됩니다.");
				} else {
					System.out.print("[가입] 패스워드 입력 : ");
					int myPw = scan.nextInt();
					System.out.println("회원 가입을 축하합니다.\n");

					arId[userCnt] = myId;
					arPw[userCnt] = myPw;
					arMoney[userCnt] = 1000;
					userCnt++;
				}
			} else if (sel == 2) {
				// 회원 탈퇴
			 if (identifier == -1) {
				System.out.println("[메시지] 로그인 후 이용가능합니다!\n");
			}else {
				//전제 :  로그인이 되어있다는 것
				
				for (int delIdx = identifier; delIdx < userCnt-1; delIdx++) {
					arId[delIdx] = arId[delIdx+1];// 삭제하려는 인덱스에 다음위치의 값을 저장한다. 
					arPw[delIdx] = arPw[delIdx+1];
					arMoney[delIdx] = arMoney[delIdx+1];
				}
				userCnt--;
				System.out.println("[메시지] 탈퇴가 완료되었습니다.");
				identifier = -1;
			}


				
			} else if (sel == 3) {
				// 로그인 하기
				if (identifier == -1) {
					System.out.print("[로그인] 아이디 입력 : ");
					int myId = scan.nextInt();
					System.out.print("[로그인] 패스워드 입력 : ");
					int myPw = scan.nextInt();

					
					int logInCheck = -1;
					for (int i = 0; i < userCnt; i++) {
						if (arId[i] == myId && arPw[i] == myPw) {
							logInCheck = i;
							break;
						}
					}
					if (logInCheck == -1) {
						System.out.println("[메시지] 아이디와 패스워드를 재확인 하세요!\n");
					} else {
						identifier = logInCheck;
						System.out.println("[메시지]" + arId[identifier] + "님 환영합니다.\n");
					}
				} else {
					System.out.println("[메시지]" + arId[identifier] + "님 로그인 중입니다.\n");
				}

			} else if (sel == 4) {
				if (identifier == -1) {
					System.out.println("[메시지] 로그인 후 이용 가능합니다.");
				} else {
					identifier = -1;
					System.out.println("[메시지] 로그아웃 되었습니다.");
				}
			} else if (sel == 5) {
				// 입금하기
				if (identifier == -1) {
					System.out.println("[메시지] 로그인 후 이용가능합니다.\n");
				} else {
					System.out.print("[입금] 입금할 금액 입력 : ");
					int myMoney = scan.nextInt();

					arMoney[identifier] += myMoney;
					System.out.println("[메시지] 입금이 완료되었습니다.");
				}
			} else if (sel == 6) {
				// 이체
				if (identifier == -1) {
					System.out.println("[메시지] 로그인 후 이용 가능합니다!\n");
				} else {
					// idenfitier !=-1로그인 된 상태
					System.out.print("[계좌 이체] 이체할 계좌 번호 입력 : ");
					int accoutNum = scan.nextInt();

					int checkAcc = -1;
					for (int i = 0; i < userCnt; i++) {
						if (arId[i] == accoutNum) {
							checkAcc = i;// 이체할 계좌의 인덱스 i 는 checkAcc 저장
						}
					}
					if (checkAcc == -1) { // 이체할 계좌번호가 arId 배열에 없다면
						System.out.println("[메시지] 이체할 계좌 번호를 재확인 해주세요!\n");
						continue;
					}

					System.out.print("[메시지] 이체할 금액을 입력하세요 : ");
					int myMoney = scan.nextInt();

					if (arMoney[identifier] >= myMoney) {
						arMoney[identifier] -= myMoney;// 나의 계좌의 금액
						arMoney[checkAcc] += myMoney;// 이체할 계좌의 금액
						System.out.println("[메시지] 이체를 완료했습니다.");
					} else {
						System.out.println("[메시지] 잔액이 부족합니다!\n");
					}

				}

			} else if (sel == 7) {
				// 잔액 조회
				if (identifier == -1) {
					System.out.println("[메시지] 로그인 후 이용 가능합니다!\n");
				} else {
					System.out.println("고객님의 잔액은 " + arMoney[identifier] + "원 입니다.\n");
				}
			} else if (sel == 0) {
				System.out.println("[메시지] 시스템 종료합니다.");
				break;
			}
		}

	}

}
