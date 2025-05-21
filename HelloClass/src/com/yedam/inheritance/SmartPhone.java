package com.yedam.inheritance;

/*
 * CellPhone 상속
 */

public class SmartPhone extends CellPhone {
	int channel;
	// 생성자
	public SmartPhone() {}
	public SmartPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	// 메소드
	void watch() {
		System.out.println(channel + "을 시청합니다");
	}
	// 부모 클래스 기능을 자식 클래스에서 다시 오버라이딩할 수 있음
	@Override
	void powerOn() {
		System.out.println("전원 ◎N");
	}
	@Override
	void powerOff() {
		System.out.println("전원 ◎FF");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
