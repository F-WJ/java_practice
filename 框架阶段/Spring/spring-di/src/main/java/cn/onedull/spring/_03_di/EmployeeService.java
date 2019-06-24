package cn.onedull.spring._03_di;

public class EmployeeService {
	private EmployeeDAO dao;
	public void setDao(EmployeeDAO dao){
		this.dao = dao;
	}
	
	public void save(){
		System.out.println("业务操作");
		dao.save();
	}

	public EmployeeDAO getDao() {
		return dao;
	}
	
}
