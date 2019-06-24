package cn.wolfcode.springmvc.domain;

public class Department {
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + "]";
	}
}
