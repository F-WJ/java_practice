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
public class Student {
	private Long id;
	private String name;
	
	//关联老师在关系
	private List<Teacher> teachers = new ArrayList<>();
}
