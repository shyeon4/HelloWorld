package com.yedam.board;
/*
 * 추가 (addBoard)
 * 수정 (modifyBoard, 글 번호를 묻고 바뀔 내용과 제목)
 * 삭제 (removeBoard, 글 번호를 입력하면 삭제함)
 * 목록 (boardList, 상세 화면 조회)
 * 조회 (getBoard, 글 번호를 입력하면 반환함)
 * 순번부여
 */

import java.util.Scanner;

public class BoardExe {
	// 필드
	private Board[] boards; // 데이터 저장
	private Scanner scn = new Scanner(System.in);
	private int bno = 2; // 배열 인덱스 (밑에 boards에서 0, 1 사용함)
	
	// 생성자
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(10, "날씨가 좋습니다", "오늘 기온이 30도입니다", "홍길동");
		boards[1] = new Board(11, "자바가 힘들어요", "미칠 것만 같아요", "고길동");
		boards[2] = new Board(12, "11", "ㅁㄴㅇㄹ", "고길동");
		boards[3] = new Board(13, "ㅁㄴㅇㄹ", "ㅇㅇ", "고길동");
		boards[4] = new Board(14, "13", "345435435", "고길동");
		boards[5] = new Board(15, "어차피 대통령은 이재명", "ㅋㅋㅋ", "고길동");
		boards[6] = new Board(16, "나라 망함", "ㅇㄴ", "고길동");
		boards[7] = new Board(17, "15", "15", "고길동");
		boards[8] = new Board(18, "16", "16", "고길동");
		boards[9] = new Board(19, "17", "17", "고길동");
		boards[10] = new Board(20, "18", "18", "고길동");
	}
	
	// 메소드
	void execute() {
		boolean run = true;
		
		// 아이디, 비밀번호 입력
		String id = userMessage("아이디를 입력하세요");
		String pw = userMessage("비밀번호를 입력하세요");
		
		if(!UserExe.login(id, pw)) {
			System.out.println("아이디와 비밀번호를 확인하세요");
			return;
		}
		System.out.println("환영합니다!");
		
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
				modifyBoard();
				break;
			case 3: // 삭제
				removeBoard();
				break;
			case 4: // 목록
				boardList();
				break;
			case 5: // 종료 
				System.out.println("프로그램을 종료합니다");
				run=false;
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
		int no = nextSequence();//Integer.parseInt(userMessage("글 번호를 입력하세요"));
		String title = userMessage("제목을 입력하세요");
		String content = userMessage("내용을 입력하세요");
		String writer = userMessage("작성자를 입력하세요");
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
//		sort();
		int page = 1;
		// 사용자가 q를 누를 때까지 반복되도록 while
		while(true) {
		int start = (page - 1) * 5;
		int end = page * 5;
		
		System.out.println("글 번호                 제목             작성자        ");
		System.out.println("==================================================");
		for(int i = start; i < end; i++) {
			if(boards[i] != null) {				
			boards[i].showInfo();
			}
		}
		// 상세 보기
		System.out.println("-------------------------------------------------");
		System.out.println("상세 보기 : 글 번호 입력, 이전(p), 다음(n), 메뉴로 이동(q)");
		System.out.println("-------------------------------------------------");
		String str = scn.nextLine();
		// 상세 보기, 메뉴
		if(str.equals("q")) {
			break; //return;
		} else if (str.equals("n")) {
			page++;
		} else if (str.equals("p")) {
			page--;
		} else {
			int no = Integer.parseInt(str);
			// 배열에서 조회 (no는 글 번호)
			Board sboard = getBoard(no);
			if(sboard == null) {
				System.out.println("조회 결과가 없습니다");
				return;
			}
			sboard.showAllInfo();
			for(int i = 0; i < boards.length; i++) {
				if(boards[i] != null && boards[i].getBoardNo() == no) {// null값이 아니면서 조건이랑 똑같으면
					boards[i].showAllInfo();
				}
			}
		}
		System.out.println();
		} // while
	}  
	
	// 수정
	void modifyBoard() {
		sort();
		int bno = userMenu("수정할 글 번호를 입력하세요");
		Board result = getBoard(bno);
		if (result == null) {
			System.out.println("조회한 결과가 없습니다");
			return;
		}
		
		String title = userMessage("수정할 제목을 입력하세요");
		String content = userMessage("수정할 내용을 입력하세요");
		
		result.setContent(content);
		result.setTitle(title);
		System.out.println("수정을 완료했습니다");
	}
	
	// 삭제
	void removeBoard() {
		int bno = userMenu("삭제할 글 번호를 입력하세요");
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null && boards[i].getBoardNo() == bno) {	
				boards[i] = null;
				System.out.println("글을 삭제하였습니다");
			}
		}
	}
	
//		int bno = userMenu("삭제할 글 번호를 입력하세요");
//		Board result = getBoard(bno);
//		if (result == null) {
//			System.out.println("조회한 결과가 없습니다");
//			return;
//		}
//		result = null;
//		System.out.println("글을 삭제하였습니다");
//	}
	
	// 단건조회(getBoard)
	// 글 번호를 활용해서 배열에서 조회하고 Board 반환
	Board getBoard(int bno) {
		for(int i = 0; i < boards.length; i++) {			
			if(boards[i] != null && boards[i].getBoardNo() == bno) {
				return boards[i];
			}
		}
		return null; // 조건에 맞는 글 번호가 없으면 null 반환
	}
	
	// 사용자의 입력값을 반환해주는 메소드
	String userMessage(String msg) {
		System.out.print(msg + " >> ");
		return scn.nextLine();
	}
	
	int userMenu(String msg) {
		System.out.print(msg + " >> ");
		return Integer.parseInt(scn.nextLine());
	}
	
	// 글 순번
	int nextSequence() {
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && max < boards[i].getBoardNo()) {
				max = boards[i].getBoardNo();
			}
		}
		return max +1;
	}
	
	
	// 밑으로 쌓이는정렬 기능
	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				}
				if (boards[i].getBoardNo() < boards[i + 1].getBoardNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	} 
	
}