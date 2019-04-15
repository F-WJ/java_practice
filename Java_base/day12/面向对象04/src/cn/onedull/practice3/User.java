package cn.onedull.practice3;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	static int totalUser;
	
	public User() {
	
	}
	
	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
		//ÿ���������һ
		totalUser++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email + "@gameschool.com";
	}
}

/*
 * �����û�id(id)���û���(username)�û�����(password)�� email
 * ��ַ(emailAdrr)�ĸ�˽�л���Ա������һ����������û�������(totalUser)��
 */