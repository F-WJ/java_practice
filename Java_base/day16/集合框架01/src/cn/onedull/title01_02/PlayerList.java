package cn.onedull.title01_02;

import java.util.Arrays;

/** �洢��ӵ���Ϣ����
 * @author Q
 *
 */
public class PlayerList {
	//��Ա����----->�����Ա�����º�
	//private int[] players = new int[5];//�� ����ĳ���д�� ,������ .. ����һ��ֵ ,���ɶ�Ӧ���ȵ�������
	//private int[] players ; //��������������int ,Ĭ��ֵ�� 0 . ��������һ������: 0����Ա �� Ĭ��ֵ�� 0
	private Object[] players ;//��װ��Integer ģʽֵ�� null ��û������
	int length = 0;//��ӵ�����  �պ�Ҳ���Ա�ʾ�������е���Ч����
	
    public PlayerList(int count){ //ͨ�������� �����������ĳ��ȸ�ֵ
    	players = new Object[count];
    }
    
    public PlayerList(){ //ͨ��������  ����������鸳 ��ʼֵ
    	players = new Object[5];
    }
    
    //���� 5 ����Ա�ϳ���������Ա����ֱ�Ϊ 11��22��33��44��55
    public void add(Object number){
    	//�������� ����ķ�Χ, ��ν���������
    	if(length == players.length){// ��Ч�ĸ��� �� ����ĳ���һ�� -----> length == players.length
//    		Integer[] arr2 = new Integer[length*2];
//    		for(int i = 0 ; i < players.length;i++){
//    			arr2[i] = players[i];
//    		}
//    		players = arr2;//�л� ���������ָ����Ǹ���ֵַ
    		
    		//---------------ʹ�� Arrays���Ѿ��ṩ�����鿽������-----------------
    		players= Arrays.copyOf(players,length*2);//��ֵplayers�е����� �γ�һ���µ�����(�������Լ��� 2 ��) ,���µ������ֵַ ָ��players
    	}
    	
    	//������� ���º�  ��ֵ�� �����������
    	players[length] = number;
    	length++;//�޸� ��ӵ�����
    }
    
    //��ѯָ������λ����Ա�����º����Ƕ��٣����ѯ����λ��Ϊ 2 �����º����� 33��
    public Object get(int index) {
    	checkIndex(index);
    	return players[index];
    }
    
    //�滻��������λ��Ϊ 2 ����Ա��ʹ�� 333 ���滻 33 ��
    public void set(int index , Object number){
    	checkIndex(index);
    	players[index] = number;
    }
    
    //���³�������λ��Ϊ 2 ����Ա��ֱ�ӷ��£�û�в�λ��
    public void remove(int index){
    	checkIndex(index);
    	//�� ���� �е� index��������ֵɾ��
    	for(int i = index ; i < length-1;i++){
    		// i����ʼֵ�� index ----->Ҫ��ָ��λ�ÿ�ʼɾ��
    		// i < length-1 ------> ÿ��Ҫ������������ i �� i+1 ,i��ֵֻ���ǵ���Ч������ǰһλ
    		players[i] = players[i+1];
    	}
    	players[length-1] = null;//����Ч���������һ�� ����Ϊ null
    	length--;//��Ч���� �Լ�
    }

	private void checkIndex(int index) {
		if(index < 0 || index >= length){ //����������� Ϊ ���� ����  �������鵱ǰ����Ч���� ,����һ����Ч������
    		throw new RuntimeException(index +"��һ����Ч������");
    	}
	}
	
    //�������е���Ϣ
	public String toString(){
		//�����е����º����
		//String string = Arrays.toString(players);//Arrays.toString() ������ȫ�����,������ ����Ҫ����  ��������е���Ч����, ����Ĳ����
		// ֻ���Լ�����д .
		if (players == null)
            return "null";

        int iMax = length- 1;//���������Ч����Ϊ �������
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
