package cn.onedull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		File f1 = new File("��Ůcopy.jpg");
		File f2 = new File("��Ů.jpg");

		// ����
		InputStream r = new FileInputStream(f1);
		// ���
		OutputStream w = new FileOutputStream(f2);

		// ����
		// char[] c = new char[1024 * 8];
		int len;
		while ((len = r.read()) != -1) {
			w.write(len - 2);
		}

		// �ر�
		w.close();
		r.close();

	}

}
