package com.yedam.ref;
/*
 * 배열 + 기본 타입(정수, 실수)
 * 배열 + 참조 타입(클래스) : 학생의 이름, 점수
*/
public class ArrayExe3 {
	
	static Student[] stdAry;
	
	public static void main(String[] args) {
		init();
		int sum = 0;
//		int max = 0;
		double max = 0;
		
		String maxName = "";
		Student maxStd = new Student(); // 인스턴스 생성
		// 배열의 값을 출력
		for (int i = 0; i < stdAry.length; i++) {
			System.out.printf("이름은 %s, 점수는 %d\n", stdAry[i].studentName, stdAry[i].score);
			sum += stdAry[i].score;
//			if (max < stdAry[i].score) {
//				max = stdAry[i].score;
				
			if (max < stdAry[i].height) {
				max = stdAry[i].height;
				
				maxStd.studentName = stdAry[i].studentName;
				maxStd.score = stdAry[i].score;
				maxStd.height = stdAry[i].height;
				maxStd.gender= stdAry[i].gender;
			}
		}
		double avg = 1.0 * sum / stdAry.length;
		String srtFmt = "멀대 이름은 %s, 점수는 %d, 키는 %.1f, 평균은 %.2f";
		System.out.printf(srtFmt, maxStd.studentName, maxStd.score, maxStd.height, avg);
	}
	

	
	public static void init() {
		Student s1 = new Student(); // 인스턴스 생성
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gender = "남";
		
		Student s2 = new Student(); // 인스턴스 생성
		s2.studentName = "김민규";
		s2.score = 85;
		s2.height = 185.4;
		s2.gender = "남";
		
		Student s3 = new Student(); // 인스턴스 생성
		s3.studentName = "김민선";
		s3.score = 90;
		s3.height = 168.4;
		s3.gender = "여";
	
		stdAry = new Student[]{ s1, s2, s3 }; // 배열에 값 할당
	}
	
	
	
	public static void test() {
		
		// 홍길동, 80
		int num1 = 90;

		Student s1 = new Student(); // 인스턴스 생성
		s1.studentName = "홍길동";
		s1.score = 80;

		// 김민규, 85
		Student s2 = new Student(); // 인스턴스 생성
		s2.studentName = "김민규";
		s2.score = 85;
		
		// 홍길동의 점수를 90점으로 변경
		s1.score = 90;
		
		// 학생 정보를 배열에 저장
		Student[] students = {s1, s2};
		students[0].studentName = "고길동";
		
		System.out.printf("이름 : %s, 점수 : %d\n", s1.studentName, s1.score);

	}

}
