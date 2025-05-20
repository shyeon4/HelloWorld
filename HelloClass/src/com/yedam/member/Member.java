package com.yedam.member;

public class Member {
	// 필드
	private String memberId;
	private String memberName;
	private String phone;
	private int point;
	
	
	
	// 생성자
	public Member() {}
	
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
			
	// 전체 필드를 매개값으로 갖는 생성자
	public Member(String memberId, String memberName, String phone, int point) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}

	
	
	// 메소드
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public int getPoint() {
		return point;
	}
	
	// 이름, 연락처, 포인트 출력 메소드
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s, 포인트는 %d입니다\n", memberName, phone, point);
	}
	
}
