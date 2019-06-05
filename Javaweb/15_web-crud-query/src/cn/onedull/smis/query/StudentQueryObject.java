package cn.onedull.smis.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentQueryObject extends QueryObject{
	//学生名
	private String studentName;
	//最小年龄
	private Integer minAge;
	//最大年龄
	private Integer maxAge;
	
}
