package cn.onedull.title07;

import java.util.Comparator;

public class NameComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.getName().length() >  o2.getName().length()) {
			return 1;
		}else if(o1.getName().length() < o2.getName().length()) {
			return -1;
		}else {
			if(o1.getAge() > o2.getAge()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		
	}

}
