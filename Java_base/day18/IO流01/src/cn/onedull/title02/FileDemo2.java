/*
������ʾFile���з���-��ȡFile·���ͼ��״̬


�ܽ�:
(1)
*/
package cn.onedull.title02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("H:\\Java����\\06IO��");
		//�ж��ļ��Ƿ����
		boolean rel = f.exists();
		System.out.println(rel);
		//��ȡ����·��
		String str = f.getAbsolutePath();
		System.out.println(str);
		//��ȡ��ǰ�ļ���
		String str2 = f.getName();
		System.out.println(str2);
		//��ȡ�ļ�·��(String����), ��getAbsolutePath�������
		String str3 = f.getPath();
		System.out.println(str3);
		//���ص�ǰ·����һ��
		String str4 = f.getParent();
		System.out.println(str4);
		//�ж�·���Ƿ��Ǿ���·��
		boolean b = f.isAbsolute();
		System.out.println(b);
		File f2 = new File("q.txt");
		System.out.println(f2.isAbsolute());
		//����Ϊ��ͨ�ļ�
		System.out.println(f.isFile());
		System.out.println(f2.isFile());
		
		
		
		
		
	}

}
