package cn.onedull.title01;

import java.util.Arrays;

public class PLayerList {
	//��Ա����
	private Integer[] players;
	//���Ӵ���
	int count = 0;
	//��ʼ��
	public PLayerList() {
		
	}
	
	public PLayerList(int players) {
		this.players = new Integer[players];
	}
	
	
	//����(add)���º�
	public void add(int num) {
		players[count] = num;
		count++;
	}
	
	
	//��ѯ���º�
	public void get(int num) {
		
	}
	
	
	//�޸����º�
	public void set() {
		
	}
	
	
	//�Ƴ����º�
	public void remove() {
		
	}
	
	
	//��ӡ���º�
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
