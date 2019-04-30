package cn.onedull.test;


import java.util.Date;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		/*
		 * System.out.println(Math.max(90, 60)); System.out.println(Math.abs(-3));
		 * System.out.println((int)(Math.random() * 10)); Random m = new Random();
		 * System.out.println(m.nextInt(100));
		 */
		
		Date d = new Date();
		System.out.println(d.toLocaleString());
		d.setDate(1);
		System.out.println(d.toLocaleString());
	
	}
}
