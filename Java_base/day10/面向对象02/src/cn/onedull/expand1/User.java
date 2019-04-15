package cn.onedull.expand1;

public class User {
		private int id;
		private String password;
		private String emailAdrr;
		
		//无参构造器
		public User(){
			
		}
		
		//有参构造器
		public User(int id, String password){
			this.id = id;
			this.password = password;
		}
		
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		public String getPassword(){
			return password;
		}
		public void setPassword(String password){
			this.password = password;
		}
		public String getEmailAdrr(){
			return emailAdrr;
		}
		public void setEmailAdrr(String emailAdrr){
			this.emailAdrr = emailAdrr + "@gameschool.com";
		}
		
	
}
