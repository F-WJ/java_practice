package cn.onedull.title01_02;

import java.util.Arrays;

/** 存储球队的信息的类
 * @author Q
 *
 */
public class PlayerList {
	//成员变量----->多个球员的球衣号
	//private int[] players = new int[5];//将 数组的长度写死 ,不合适 .. 给他一个值 ,生成对应长度的数据组
	//private int[] players ; //如果数组的类型是int ,默认值是 0 . 这样会有一个歧义: 0号球员 和 默认值是 0
	private Object[] players ;//包装类Integer 模式值是 null 就没有歧义
	int length = 0;//添加的索引  刚好也可以表示这个球队中的有效人数
	
    public PlayerList(int count){ //通过构造器 给里面的数组的长度赋值
    	players = new Object[count];
    }
    
    public PlayerList(){ //通过构造器  给里面的数组赋 初始值
    	players = new Object[5];
    }
    
    //安排 5 个球员上场，比如球员号码分别为 11、22、33、44、55
    public void add(Object number){
    	//当超出了 数组的范围, 如何将数组扩容
    	if(length == players.length){// 有效的个数 和 数组的长度一致 -----> length == players.length
//    		Integer[] arr2 = new Integer[length*2];
//    		for(int i = 0 ; i < players.length;i++){
//    			arr2[i] = players[i];
//    		}
//    		players = arr2;//切换 球队中数组指向的那个地址值
    		
    		//---------------使用 Arrays中已经提供的数组拷贝方法-----------------
    		players= Arrays.copyOf(players,length*2);//赋值players中的数据 形成一个新的数组(长度是自己的 2 倍) ,将新的数组地址值 指向players
    	}
    	
    	//将传入的 球衣号  赋值到 里面的数组中
    	players[length] = number;
    	length++;//修改 添加的索引
    }
    
    //查询指定索引位置球员的球衣号码是多少，如查询索引位置为 2 的球衣号码是 33。
    public Object get(int index) {
    	checkIndex(index);
    	return players[index];
    }
    
    //替换场上索引位置为 2 的球员，使用 333 号替换 33 号
    public void set(int index , Object number){
    	checkIndex(index);
    	players[index] = number;
    }
    
    //罚下场上索引位置为 2 的球员（直接罚下，没有补位）
    public void remove(int index){
    	checkIndex(index);
    	//将 数组 中的 index索引出的值删除
    	for(int i = index ; i < length-1;i++){
    		// i的起始值是 index ----->要从指定位置开始删除
    		// i < length-1 ------> 每次要操作两个索引 i 和 i+1 ,i的值只能是到有效个数的前一位
    		players[i] = players[i+1];
    	}
    	players[length-1] = null;//将有效个数的最后一个 设置为 null
    	length--;//有效个数 自减
    }

	private void checkIndex(int index) {
		if(index < 0 || index >= length){ //当传入的索引 为 负数 或者  大于数组当前的有效个数 ,就是一个无效的索引
    		throw new RuntimeException(index +"是一个无效的索引");
    	}
	}
	
    //输出球队中的信息
	public String toString(){
		//将所有的球衣号输出
		//String string = Arrays.toString(players);//Arrays.toString() 将数组全部输出,而现在 我们要的是  输出数组中的有效数据, 多余的不输出
		// 只能自己重新写 .
		if (players == null)
            return "null";

        int iMax = length- 1;//以数组的有效个数为 最大索引
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
