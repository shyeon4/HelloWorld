package com.yedam;

/*
 * 라이브러리 클래스
 */

public class Student {
	// 필드(속성) 
	private int studentNo;
	private String studentName;
	private double height;
	private int engScore;
	private int mathScore;
	
	
	
	// 생성자(객체 : instance의 초기화)
	public Student() {
		// 클래스 이름(매개값, 없는 생성자는 기본 생성자)
		// 아무것도 없을 경우엔 컴파일러?????가 생성됨
	}
	
	public Student(int studentNo, String studentName) {
		this.studentNo = studentNo;
		// 첫 번째 매개값은 학생 번호를 할당
		this.studentName = studentName;
		// 학생 이름을 할당
	}
		
	public Student(int studentNo, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	
	}
	
	
	
	// 메소드(기능)
	void study() {
		System.out.println("공부를 합시다");
	}
	void introduce() {
		System.out.printf("학번은 %d이고 이름은 %s입니다\n", studentNo, studentName);
	}
	
	// 학번, 이름
	void setStudentNo(int studentNo) {
		if(studentNo < 0 || studentNo > 10000) {
			return;
		}
		this.studentNo = studentNo;
	}
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// 영어, 수학 점수
	void setEngScore(int engScore) {
		if(engScore < 0 || engScore > 100) {
			return;
		}
		this.engScore = engScore;
	}
	void setMathScore(int mathScore) {
		if(mathScore < 0 || mathScore > 100) {
			return;
		}
		this.mathScore = mathScore;
	}
	
	// 학번을 반환
	int getStudentNo() {
		return studentNo;
	}
	
	String getStudentName() {
		return studentName;
	}
	
	int getEngScore() {
		return engScore;
	}
	
	int getMathScore() {
		return mathScore;
	}

}

