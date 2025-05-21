package com.yedam.inheritance;
/*
 * 부모 : CellPhone
 * - 통화, 전원 ON/OFF, 볼륨 UP/DOWN
 * - Model, Color
 * 
 * 자식 : SmartPhone
 * - TV 보기
 */
public class CellPhone /* extends Object (모든 부모 클래스 위에는 오브젝트?가 있다)*/{
	String model;
	String color;
	
	// 생성자
	public CellPhone() {}
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메소드
	void powerOn() {
		System.out.println("전원 ON");
	}
	void powerOff() {
		System.out.println("전원 OFF");
	}
	void 전화하기() {
		System.out.println("전화하기");
	}
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return "CellPhone [model=" + model + ", color=" + color + "]";
	}

}
