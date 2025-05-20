package com.yedam.board;
/*
 * 추가, 수정, 삭제, 목록
 */

import java.util.Scanner;

public class BoardExe {
	// 필드
	private Board[] boards; // 데이터 저장
	private Scanner scn = new Scanner(System.in);
	private int bno = 0;
	
	// 생성자
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(10, "날씨가 좋습니다", "오늘 기온이 30도입니다", "홍길동");
		boards[1] = new Board(11, "자바가 힘들어요", "미칠 것만 같아요", "고길동");
	}
	
	// 메소드
	void execute() {
		boolean run = true;
		while(run) {
			System.out.println("==================================================");
			System.out.println("1. 추가     2. 수정     3. 삭제     4. 목록     5. 종료");
			System.out.println("==================================================");
			System.out.print("선택 >> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			switch(selectNo) {
			case 1: // 추가
				addBoard();
				break;
			case 2: // 수정
			case 3: // 삭제
			case 4: // 목록
				boardList();
				break;
			case 5: // 종료 
			default:
				System.out.println("메뉴를 다시 선택하세요");
			} // switch
		} // while
	} // execute
	
	// 기능 
	// 글 번호를 입력하세요 >> 1
	// 제목을 입력하세요 >> 오늘은 덥네요
	// 내용을 입력하세요 >> 30도가 넘는다
	// 작성자를 입력하세요 >> 홍길동
	// 추가 성공 / 추가 실패
	void addBoard() {
		System.out.print("글 번호를 입력하세요 >> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("제목을 입력하세요 >> ");
		String title = scn.nextLine();
		System.out.print("내용을 입력하세요 >> ");
		String content = scn.nextLine();
		System.out.print("작성자를 입력하세요 >> ");
		String writer = scn.nextLine();
		// board 인스턴스 선언하고 값을 지정
		Board board = new Board(no, title, content, writer);
		// 배열에 저장
		boards[bno++] = board;
		System.out.println("작성 완료");
	}
	
	// 글 번호   제목              작성자
	//=================================
	//   1     어려워              ㅇㅇ
	//   2     힘들다              ㅁㅁ
	//   3     모르겠다             ㅋㅋ
	//   4     ㅠㅠ                ㅍㅍ
	//---------------------------------
	//상세 보기 : 글 번호 입력, 메뉴로 이동 (q)
	//---------------------------------
	
	//======== 등록된 글이 없습니다 =========
	void boardList() {
		System.out.println("글 번호                 제목             작성자        ");
		System.out.println("==================================================");
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null) {				
			boards[i].showInfo();
			}
		}
		// 상세 보기
		System.out.println("-------------------------------------------------");
		System.out.println("       상세 보기 : 글 번호 입력, 메뉴로 이동 (q)"          );
		System.out.println("-------------------------------------------------");
		String str = scn.nextLine();
		// 상세 보기, 메뉴
		if(str.equals("q")) {
			return;
		} else {
			int no = Integer.parseInt(str);
			// 배열에서 조회 (no는 글 번호)
			for(int i = 0; i < boards.length; i++) {
				if(boards[i] != null && boards[i].getBoardNo() == no) // null값이 아니면서 조건이랑 똑같으면
					boards[i].showAllInfo();
			}
		}
	}

}
