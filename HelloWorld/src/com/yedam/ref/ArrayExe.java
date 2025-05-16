package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe {
	public static void main(String[] args) {
		friendApp();
	} // end of main

	public static void friendApp() {
		Scanner scn = new Scanner(System.in);
		String[] friendAry = new String[10];

		boolean run = true;
		while (run) {
			System.out.println("1.추가 2. 목록. 3.삭제 4.종료");
			System.out.print("선택하세요");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 추가
				System.out.println("이름을 입력하세요");
				String addname = scn.nextLine();
				String nname = "중복";
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] == null) {
						friendAry[i] = addname;
						nname = "미중복";
						System.out.println("입력 성공");
						break;
					}
				}
				if (nname.equals("중복")) { 
					System.out.println("추가하시겠습니까? 1.추가 2.취소");
					System.out.print("선택하세요");
				}	
				break;

			case 2: // 목록
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null) {
						System.out.printf("%d. %s\n", i, friendAry[i]);
					}
				}
				break;

			case 3: // 삭제
				System.out.println("삭제할 친구를 입력하세요");
				String delname = scn.nextLine();
				String noname = "없음"; // (찾기) 1 변수를 하나 만들어서
				for (int i = 0; i < friendAry.length; i++) {
					if (friendAry[i] != null && friendAry[i].equals(delname)) {
						friendAry[i] = null;
						noname = "있음"; // (찾기) 3 있을 경우 있다고 출력하기
						System.out.println("삭제했습니다");
						break;
					}
				}
				if (noname.equals("없음")) { // (찾기) 2 없을 경우를 하나 만들어주고
					System.out.println("찾는 이름이 없습니다.");
				}
				break;

			case 4: // 종료
				System.out.println("프로그램을 종료합니다");
				run = false;
			} // end of switch

		} // end of while

	} // end of friendApp

	public static void deleteAry() {
		Scanner scn = new Scanner(System.in);
		String[] stringAry = new String[10];
		stringAry[0] = "홍길동";
		stringAry[1] = "고길동";
		stringAry[2] = "김길동";
		stringAry[3] = "최길동";

		System.out.println("삭제할 친구를 입력하세요");
		String name = scn.nextLine();

		// 삭제할 친구를 검색
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null && stringAry[i].equals(name)) {
				// 문자는 equals, null 값에 입력되면 오류 나서 != 넣기
				stringAry[i] = null; // null = 삭제
			} // end of if
		} // end of for

		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null) {
				System.out.printf("stringAry[%d]번째의 값 : %s\n", i, stringAry[i]);
			} // end of if
		} // end of for
		System.out.println("end of prog");

	} // end of deleteAry

	// 문자열 배열
	public static void strAry() {
		Scanner scn = new Scanner(System.in); // 입력해서

		String[] stringAry = new String[10]; // (규칙) 위에서 입력한 값을 저장

		while (true) {
			System.out.print("이름을 입력하세요");
			String name = scn.nextLine(); // 입력한 값을 name이란 곳에 저장함
			if (name.equals("quit")) {
				break;
			} // end of if

			for (int i = 0; i < stringAry.length; i++) { // length = stringAry의 크기?
				if (stringAry[i] == null) { // 빈 공간(null) 체크
					stringAry[i] = name;
					System.out.println("입력 성공");
					break; // 하나 넣었으면 브레이크! 아니면 빈 칸에 다 채움
				} // end of if
			} // end of for
		} // end of while

		// 입력한 값 출력
		for (int i = 0; i < stringAry.length; i++) {
			if (stringAry[i] != null) {
				System.out.printf("stringAry[%d]번째의 값 : %s\n", i, stringAry[i]);
			} // end of if
		} // end of for
		System.out.println("end of prog");

	} // end of strAry

} // end of class