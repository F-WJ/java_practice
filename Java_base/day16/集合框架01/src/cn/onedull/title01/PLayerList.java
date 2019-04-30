package cn.onedull.title01;

import java.util.Arrays;

public class PLayerList {
	//成员变量
	private Integer[] players;
	//增加次数
	int count = 0;
	//初始化
	public PLayerList() {
		
	}
	
	public PLayerList(int players) {
		this.players = new Integer[players];
	}
	
	
	//增加(add)球衣号
	public void add(int num) {
		players[count] = num;
		count++;
	}
	
	
	//查询球衣号
	public void get(int num) {
		
	}
	
	
	//修改球衣号
	public void set() {
		
	}
	
	
	//移除球衣号
	public void remove() {
		
	}
	
	
	//打印球衣号
	public String toString() {
		//String str = Arrays.toString(players);
        if (players == null)
            return "null";

        int iMax = count - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(players[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
	}
}
