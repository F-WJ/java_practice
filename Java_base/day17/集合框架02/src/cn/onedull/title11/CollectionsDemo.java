/*
���󣺵���Arrays ��Collections �������еĳ��÷���
asList ����

����:
(1)ʹArrays���asList

�ܽ�:
(1)ͨ��aslist����װ����list, ��֧��remove��add����
*/
package cn.onedull.title11;

import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		String[] arr = new String[]{"С��", "С��" ,"С��"};
		List<String> list = Arrays.asList(arr);
		list.add("xiao ");
	}

}
