package com.yedam.board;
/* 
 * 아이디, 비밀번호, 이름
 */
class User {
	private String userID;
	private String passwd;
	private String userName;
	
	//생성자
	public User(String userID, String passwd, String userName) {
//		super();
		this.userID = userID;
		this.passwd = passwd;
		this.userName = userName;
	}
	
	//getter
	public String getUserID() {
		return userID;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUserName() {
		return userName;
	}
}

public class UserExe {
	static User[] users = {
			new User("Holy", "1111", "김영광")
			, new User("Cutie", "2222", "홍예쁨")
			, new User("guest", "3333", "밤손님");
	};
	
	static boolean login(String uname, String passwd) {
		for (int i = 0; i < users.length; i++) {
			if(users[i].getUserID().equals(uname)
					&& users[i].getPasswd().equals(passwd)) {
				return true;
			}
		}
		return false;
	}

}
