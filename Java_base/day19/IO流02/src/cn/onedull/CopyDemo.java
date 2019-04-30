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
		File f1 = new File("美女copy.jpg");
		File f2 = new File("美女.jpg");

		// 输入
		InputStream r = new FileInputStream(f1);
		// 输出
		OutputStream w = new FileOutputStream(f2);

		// 输入
		// char[] c = new char[1024 * 8];
		int len;
		while ((len = r.read()) != -1) {
			w.write(len - 2);
		}

		// 关闭
		w.close();
		r.close();

	}

}
