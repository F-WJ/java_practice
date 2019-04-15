package cn.onedull.object_demo;

public class Person {
	private int age;
	
	public void setAge(int age){
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
	
}
