package com.yedam.ref.app;

import java.util.Scanner;

/*
 * 회원 추가, 수정, 조회, 삭제 기능
 * 1 추가 (아이디, 이름, 전화번호, 포인트)
 * 2 수정 (아이디=조회 용도, 전화번호)
 * 3 조회 (이름)
*/ 

public class MemberExe {
	
	static Member[] ids = null;
	public static void main(String[] args) {
		boolean run = true;
		
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.회원가입   2.정보 수정   3.회원 조회   4.삭제   5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택하세요");
		
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		ids = new Member[2];
		
		if (selectNo == 1) {
			for (int i = 0; i < ids.length; i++) {
					
			System.out.printf("ids[%d] 아이디를 입력하세요 \n", i);
			String id = scanner.nextLine();
			
			System.out.printf("ids[%d] 이름을 입력하세요 \n", i);
			String name = scanner.nextLine();
			
			System.out.printf("ids[%d] 전화번호를 입력하세요 \n", i);
			String tel = scanner.nextLine();
			
			System.out.printf("ids[%d] 포인트를 입력하세요 \n", i);
			int point = Integer.parseInt(scanner.nextLine());
			
			// 인스턴스 생성
			Member member = new Member();
			member.id = id;
			member.name = name;
			member.tel = tel;
			member.point = point;
			ids[i] = member;
			
			}
			
			
			
		} else if (selectNo == 2) {
			
		} else if (selectNo == 3) {
			
			System.out.print("검색할 이름을 입력하세요");
			String keyword = scanner.nextLine();
			
			for (int i = 0; i < ids.length; i++) {
				if (ids[i].name.equals(keyword))
					System.out.printf("아이디 : %s, 이름 : %s입니다\n", ids[i].id, ids[i].name);
				}
			}
		
		} // while
		System.out.println("프로그램 종료");
		
	} // main
	
} // class
