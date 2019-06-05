package cn.onedull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
	private String name = "小天";
	private int age = 18;
	private String[] hobby = {"java", "music"};
	private List<String> list = Arrays.asList("A", "B");
	private Map<String, String> map = new HashMap<>();
}
