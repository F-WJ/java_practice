package cn.onedull.mybatistest.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private Long id;
	private String name;
	
	//关联员工关系
	private List<Employee> employee = new ArrayList<>();
}
