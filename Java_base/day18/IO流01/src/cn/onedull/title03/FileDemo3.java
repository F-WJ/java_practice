/*
������ʾFile���е��ļ���������

(1)
����:
�ܽ�:
(1)length�������ص�ǰĿ¼�������ļ���Ŀ¼( �������·�������ļ���, ����null)
*/
package cn.onedull.title03;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo3 {

	public static void main(String[] args) {
		//����File����
		File f = new File("H:\\Java����\\06IO��");
		File f2 = new File("q.txt");
		//�����ļ����ݵĳ���( �����txt�ļ�, �����������ֽ� )
		System.out.println(f.length());
		System.out.println(f2.length());
		//���ص�ǰĿ¼�������ļ���Ŀ¼( �������·�������ļ���, ����null)
		String[] str = f2.list();
		System.out.println(Arrays.deepToString(str));
		f.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return false;
			};
		
		});
		
		
	}

}
