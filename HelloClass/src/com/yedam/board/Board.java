package com.yedam.board;

// Board : 글 번호, 제목, 내용, 작성자
// getter, setter, 작성 : 메소드
// 기본 생성자, 전체 매개값을 갖는 생성자
public class Board {
	private int boardNo; // 글 번호
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자
	
	// 생성자
	public Board() {}
	public Board(int boardNo, String title, String content, String writer) {
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 메소드
	
	
	// 메소드
		public void setBaordNo(int boardNo) {
			this.boardNo = boardNo;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setContent(String content) {
			this.content = content;
		}
		
		public void setWriter(String writer) {
			this.writer = writer;
		}
		
		public int getBoardNo() {
			return boardNo;
		}
		
		public String getTitle() {
			return title;
		}
		
		public String getContent() {
			return content;
		}
		
		public String getWriter() {
			return writer;
		}
		
		// 글 번호, 제목, 작성자를 간략하게 출력
		public void showInfo() {
			System.out.printf("%5d %20s %8s\n", boardNo, title, writer);
		}
		
		public void showAllInfo() {
			// 글 번호 : 5 , 작성자 : ㅇㅇ
			// 제목 : ㅁㄴㅇㄹ
			// 내용 : ㅂㅈㄷㄱㅁㄴㅇㄹㅋㅊㅌㅍ
			String strFormat = "글 번호 : %d\n";
			strFormat += "작성자 : %s\n";
			strFormat += "제목 : %s\n";
			strFormat += "내용 : %s\n";		
			System.out.printf(strFormat, boardNo, writer, title, content);
		}

}
