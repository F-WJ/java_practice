/*
*/
package cn.onedull.title03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("a.txt"));
		Object readObject = in.readObject();
		int read = in.read();
		System.out.println(readObject);
		System.out.println(read);
		in.close();
	}

}
